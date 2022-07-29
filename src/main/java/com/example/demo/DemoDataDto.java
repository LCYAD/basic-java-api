package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoDataDto {
    private String serviceName;
    private LocalDateTime currentTime;
    private final String dateTimeFmt = "yyyy/MM/dd HH:mm:ss";

    DemoDataDto(String serviceName) {
        this.serviceName = serviceName;
        this.currentTime = LocalDateTime.now();
    }

    DemoDataDto(String serviceName, String currentTime) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(this.dateTimeFmt);
        this.serviceName = serviceName;
        this.currentTime = LocalDateTime.parse(currentTime, dtf);
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getCurrentTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(this.dateTimeFmt);
        return dtf.format(this.currentTime);
    }
}
