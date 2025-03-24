package com.omeraytekin.design_patterns.structural.adapter;

public class LegacyLogger {
    public void writeLog(String level, String message, String source) {
        String logEntry = String.format("[%s] %s - Source: %s", level, message, source);
        System.out.println("Legacy system logging: " + logEntry);
    }
}
