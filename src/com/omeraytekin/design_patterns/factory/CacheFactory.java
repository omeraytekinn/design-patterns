package com.omeraytekin.design_patterns.factory;

public abstract class CacheFactory<K, V> {
    protected Cache<K, V> instance;

    public abstract Cache<K, V> getCache();

    public int cacheSize() {
        return instance.size();
    }

    public void clearCache() {
        instance.clear();
    }
}
