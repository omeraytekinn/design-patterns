package com.omeraytekin.design_patterns.structural.adapter;

public class LegacyClient {
    private LegacyLogger logger = new LegacyLogger();

    public void doAction() {
        logger.writeLog("DEBUG", "doAction log", "LegacyClient");
    }
}
