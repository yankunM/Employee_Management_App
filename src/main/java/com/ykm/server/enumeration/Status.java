package com.ykm.server.enumeration;

/**
 * @author yankunM
 * @version 1.0
 * @since 1/29/2023
 */
public enum Status {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");

    private final String status;
    Status(String status) {
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }

}
