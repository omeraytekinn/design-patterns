package com.omeraytekin.design_patterns.structural.adapter;

public class LegacyLoggerAdapter implements ModernLogger {
    private final LegacyLogger legacyLogger;
    private final String source;

    public LegacyLoggerAdapter(LegacyLogger legacyLogger, String source) {
        this.legacyLogger = legacyLogger;
        this.source = source;
    }

    @Override
    public void debug(String message) {
        legacyLogger.writeLog("DEBUG", message, source);
    }

    @Override
    public void info(String message) {
        legacyLogger.writeLog("INFO", message, source);
    }

    @Override
    public void error(String message) {
        legacyLogger.writeLog("ERROR", message, source);
    }

    @Override
    public void trace(String message) {
        legacyLogger.writeLog("DEBUG", "[TRACE] " + message, source);
    }
}