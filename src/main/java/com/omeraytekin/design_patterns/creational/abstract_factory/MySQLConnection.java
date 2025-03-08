package com.omeraytekin.design_patterns.creational.abstract_factory;

public class MySQLConnection implements DatabaseConnection {
    private String dbURL;

    public MySQLConnection(String dbURL) {
        this.dbURL = dbURL;
    }

    @Override
    public void connect() {
        System.out.println("Connected to MySQL database (URL: " + dbURL + ")");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from MySQL database");
    }
}
