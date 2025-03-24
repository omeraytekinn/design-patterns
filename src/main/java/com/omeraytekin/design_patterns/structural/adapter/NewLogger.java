package com.omeraytekin.design_patterns.structural.adapter;

public class NewLogger implements ModernLogger {
    private final String source;

    public NewLogger(String source) {
        this.source = source;
    }

    @Override
    public void debug(String message) {
        System.out.println(String.format("[DEBUG] %s - Source: %s", message, source));
    }

    @Override
    public void info(String message) {
        System.out.println(String.format("[INFO] %s - Source: %s", message, source));
    }

    @Override
    public void error(String message) {
        System.out.println(String.format("[ERROR] %s - Source: %s", message, source));
    }

    @Override
    public void trace(String message) {
        System.out.println(String.format("[TRACE] %s - Source: %s", message, source));
    }

}
