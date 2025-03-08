package com.omeraytekin.design_patterns.creational.factory;

public class Client {
    private CacheFactory<String, String> cacheFactory;
    private String type;

    public Client(CacheFactory<String, String> cacheFactory, String type) {
        this.cacheFactory = cacheFactory;
        this.type = type;
    }

    public void run() {
        Cache<String, String> cache = cacheFactory.getCache();
        test(cache, type);
    }

    private static void test(Cache<String, String> cache, String type) {
        String[][] pairs = {
                { "Key-1", "Value-1" },
                { "Key-2", "Value-2" },
                { "Key-3", "Value-3" },
                { "Key-4", "Value-4" },
                { "Key-5", "Value-5" }
        };

        System.out.println("[" + type + "] inserting data to cache.");
        for (String[] pair : pairs) {
            cache.put(pair[0], pair[1]);
        }

        System.out.println("\n[" + type + "] Getting Key-1 from cache:");
        cache.printKey("Key-1");

        System.out.println("\n[" + type + "] Key Value Pairs:");
        cache.printCache();

        System.out.println("\n[" + type + "] Removing Key-3 from cache.");
        cache.remove("Key-3");

        System.out.println("[" + type + "] Key Value Pairs:");
        cache.printCache();

        System.out.println("\n[" + type + "] Clearing cache.");
        cache.clear();

        System.out.println("[" + type + "] Key Value Pairs:");
        cache.printCache();
    }
}
