package com.example.apiprac.DesignPatterns;

public class NotificationFactoryPattern {
    public static Notification createNotification(String type){
        return switch(type){
            case "EMAIL" -> new EmailNotification();
            case "SMS" -> new SMSNotification();
            case "PUSH" -> new PUSHNotification();
            default -> throw new IllegalArgumentException("unknown type");
        };
    }
}
