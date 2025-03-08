package com.omeraytekin.design_patterns.abstract_factory;

public class PostgreSQLConnection implements DatabaseConnection {
    private String dbURL;

    public PostgreSQLConnection(String dbURL) {
        this.dbURL = dbURL;
    }

    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL database (URL: " + dbURL + ")");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from PostgreSQL");
    }
}
