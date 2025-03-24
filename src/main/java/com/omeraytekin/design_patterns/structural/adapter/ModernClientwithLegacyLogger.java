package com.omeraytekin.design_patterns.structural.adapter;

public class ModernClientwithLegacyLogger {
    private ModernLogger logger = new LegacyLoggerAdapter(new LegacyLogger(), "ModernClientwithLegacyLogger");

    public void doAction() {
        logger.trace("doAction log");
    }
}
