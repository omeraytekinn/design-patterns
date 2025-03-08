package com.omeraytekin.design_patterns.factory;

public class Test {
    public static void main(String[] args) {
        CacheFactory<String, String> cacheFactory = new InMemoryCacheFactory<>();
        Client inMemoryClient = new Client(cacheFactory, "In Memory Cache");
        inMemoryClient.run();
        cacheFactory = new RedisCacheFactory<>();
        Client redisClient = new Client(cacheFactory, "Redis Cache");
        redisClient.run();
    }
}
