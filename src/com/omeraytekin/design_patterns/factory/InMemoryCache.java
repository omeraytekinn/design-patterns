package com.omeraytekin.design_patterns.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InMemoryCache<K, V> implements Cache<K, V> {
    private Map<K, V> cache;

    public InMemoryCache() {
        cache = new HashMap<>();
    }

    public void put(K key, V val) {
        cache.put(key, val);
    }

    public V get(K key) {
        return cache.get(key);
    }

    public V remove(K key) {
        return cache.remove(key);
    }

    public void clear() {
        cache.clear();
    }

    public int size() {
        return cache.size();
    }

    public void printCache() {
        Set<K> keys = cache.keySet();
        for (K key : keys) {
            printKey(key);
        }
    }

    public void printKey(K key) {
        V value = cache.get(key);
        System.out.println("Key: [" + key + "] -> Value: [" + value + "]");
    }
}
