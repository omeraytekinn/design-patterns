package com.omeraytekin.design_patterns.structural.adapter;

public interface ModernLogger {
    void debug(String message);

    void info(String message);

    void error(String message);

    void trace(String message);
}
