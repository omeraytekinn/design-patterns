package com.omeraytekin.design_patterns.abstract_factory;

public class Test {
    public static void main(String[] args) {
        DatabaseFactory databaseFactory = new MySQLFactory();
        Client client = new Client(databaseFactory, "mysql://username:password@localhost/mydb");
        System.out.println("[TESTING MYSQL DATABASE]");
        client.run();
        databaseFactory = new PostgreSQLFactory();
        client = new Client(databaseFactory, "postgresql://username:password@localhost/mydb");
        System.out.println("\n[TESTING POSTGRESQL DATABASE]");
        client.run();
    }
}
