package com.omeraytekin.design_patterns.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static volatile ConfigurationManager instance;
    private Map<String, String> configSettings;

    private ConfigurationManager() {
        configSettings = new HashMap<>();
        initSettings();
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public void setConfig(String configName, String config) {
        configSettings.put(configName, config);
    }

    public String getConfig(String configName) {
        return configSettings.get(configName);
    }

    private void initSettings() {
        configSettings.put("db_type", "postgresql");
        configSettings.put("db_url", "postgresql://postgres@localhost");
    }

}
