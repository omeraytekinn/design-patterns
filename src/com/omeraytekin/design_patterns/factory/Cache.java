package com.omeraytekin.design_patterns.factory;

public interface Cache<K, V> {
    public void put(K key, V val);

    public V get(K key);

    public V remove(K key);

    public void clear();

    public int size();

    public void printCache();

    public void printKey(K key);
}
