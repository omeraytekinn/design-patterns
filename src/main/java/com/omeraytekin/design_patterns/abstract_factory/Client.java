package com.omeraytekin.design_patterns.abstract_factory;

public class Client {
    private DatabaseFactory databaseFactory;
    private String dbURL;

    public Client(DatabaseFactory databaseFactory, String dbURL) {
        this.databaseFactory = databaseFactory;
        this.dbURL = dbURL;
    }

    public void run() {
        DatabaseConnection connection = databaseFactory.createConnection(dbURL);
        DatabaseQuery query = databaseFactory.createQuery();
        connection.connect();
        query.executeQuery("SELECT * FROM products;");
        connection.disconnect();
    }
}
