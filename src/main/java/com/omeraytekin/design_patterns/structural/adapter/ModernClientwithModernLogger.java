package com.omeraytekin.design_patterns.structural.adapter;

public class ModernClientwithModernLogger {
    private ModernLogger logger = new NewLogger("ModernClientwithModernLogger");

    public void doAction() {
        logger.error("doAction log");
    }
}
