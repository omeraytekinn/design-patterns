package com.omeraytekin.design_patterns.factory;

public class RedisCacheFactory<K, V> extends CacheFactory<K, V> {
    public Cache<K, V> getCache() {
        if (instance == null) {
            instance = new InMemoryCache<>();
        }
        return instance;
    }
}
