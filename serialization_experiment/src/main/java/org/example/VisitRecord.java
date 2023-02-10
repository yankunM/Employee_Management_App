package org.example;

import java.time.LocalDateTime;

public class VisitRecord {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getEntry() {
        return entry;
    }

    public void setEntry(LocalDateTime entry) {
        this.entry = entry;
    }

    public LocalDateTime getExit() {
        return exit;
    }

    public void setExit(LocalDateTime exit) {
        this.exit = exit;
    }

    // Attributes
    String name;
    LocalDateTime entry;
    LocalDateTime exit;

    // Constructors
    public VisitRecord(String n, LocalDateTime en, LocalDateTime ex) throws Exception {
        if(ex.isBefore(en)) throw new InvalidEntryExitTimeException();
        this.name = n;
        this.entry = en;
        this.exit = ex;
    }
    public VisitRecord(String n, LocalDateTime en) throws Exception {
        this.name = n;
        this.entry = en;
        this.exit = null;
    }
}

class InvalidEntryExitTimeException extends Exception {
    public InvalidEntryExitTimeException(){
        super();
    }
}
