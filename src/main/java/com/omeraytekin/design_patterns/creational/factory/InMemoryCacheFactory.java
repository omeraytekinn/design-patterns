package com.omeraytekin.design_patterns.creational.factory;

public class InMemoryCacheFactory<K, V> extends CacheFactory<K, V> {
    @Override
    public Cache<K, V> getCache() {
        if (instance == null) {
            instance = new InMemoryCache<>();
        }
        return instance;
    }
}
