package com.omeraytekin.design_patterns.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class GlobalApplicationContext {
    private static volatile GlobalApplicationContext instance;
    private Map<Class<?>, Object> context;

    private GlobalApplicationContext() {
        context = new HashMap<>();
    }

    public static GlobalApplicationContext getInstance() {
        if (instance == null) {
            synchronized (GlobalApplicationContext.class) {
                if (instance == null) {
                    instance = new GlobalApplicationContext();
                }
            }
        }
        return instance;
    }

    public void registerBean(Class<?> clazz, Object object) {
        context.put(clazz, object);
    }

    @SuppressWarnings("unchecked")
    public <T> T getBean(Class<T> clazz) {
        return (T) context.get(clazz);
    }
}
