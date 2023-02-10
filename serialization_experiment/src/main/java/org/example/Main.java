package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.time.LocalDateTime;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Random;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());

        // simulate data
        long timeStamp = 1_499_070_300L;
        LocalDateTime entime = LocalDateTime.ofInstant(Instant.ofEpochSecond(timeStamp), TimeZone.getDefault().toZoneId());
        timeStamp = 1_499_080_300L;
        LocalDateTime extime = LocalDateTime.ofInstant(Instant.ofEpochSecond(timeStamp), TimeZone.getDefault().toZoneId());
//
////        System.out.println(rd.nextLong());
//
//        // generate random epoch time upper bounded by time right now
//        LocalDateTime ti = LocalDateTime.now();
//
//        ZonedDateTime zdt = ZonedDateTime.of(ti, ZoneId.systemDefault());
//        long timeRightNow = zdt.toInstant().toEpochMilli();

        try {
            VisitRecord v1 = new VisitRecord("YangYang", entime, extime);
            String jsonData = mapper.writeValueAsString(v1);
            System.out.println(jsonData);
        } catch (Exception e) {
            e.printStackTrace();
        }

//
//        for (int i = 0; i < 10000; i++) {
//            Random rd = new Random();
//            String n = "YangYang";
//            LocalDateTime entryTime = getRandomLocalDateTime(timeRightNow, rd);
//            LocalDateTime exitTime = getRandomLocalDateTime(timeRightNow, rd);
//            try {
//                VisitRecord v = new VisitRecord(n, entryTime, exitTime);
//                System.out.println(v);
//            } catch (Exception ignored) {
//
//            }
//        }
    }

    private static LocalDateTime getRandomLocalDateTime(long timeRightNow, Random rd) {
        long timeStamp = Math.abs(rd.nextLong() % timeRightNow);
        LocalDateTime time = LocalDateTime.ofInstant(Instant.ofEpochMilli(timeStamp), TimeZone.getDefault().toZoneId());
        return time;
    }
}