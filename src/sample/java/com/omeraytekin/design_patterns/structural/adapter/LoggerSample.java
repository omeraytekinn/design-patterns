package com.omeraytekin.design_patterns.structural.adapter;

public class LoggerSample {
    public static void main(String[] args) {
        LegacyClient legacyClient = new LegacyClient();
        legacyClient.doAction();
        ModernClientwithLegacyLogger modernClientwithLegacyLogger = new ModernClientwithLegacyLogger();
        modernClientwithLegacyLogger.doAction();
        ModernClientwithModernLogger modernClientwithModernLogger = new ModernClientwithModernLogger();
        modernClientwithModernLogger.doAction();
    }
}
