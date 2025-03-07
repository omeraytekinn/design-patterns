package com.omeraytekin.design_patterns.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RedisCache<K, V> implements Cache<K, V> {
    private Map<K, V> redisStubCache;

    public RedisCache() {
        redisStubCache = new HashMap<>();
    }

    @Override
    public void put(K key, V val) {
        redisStubCache.put(key, val);
    }

    @Override
    public V get(K key) {
        return redisStubCache.get(key);
    }

    @Override
    public V remove(K key) {
        return redisStubCache.remove(key);
    }

    @Override
    public void clear() {
        redisStubCache.clear();
    }

    @Override
    public int size() {
        return redisStubCache.size();
    }

    @Override
    public void printCache() {
        Set<K> keys = redisStubCache.keySet();
        for (K key : keys) {
            printKey(key);
        }
    }

    @Override
    public void printKey(K key) {
        V value = redisStubCache.get(key);
        System.out.println("Key: [" + key + "] -> Value: [" + value + "]");
    }
}
