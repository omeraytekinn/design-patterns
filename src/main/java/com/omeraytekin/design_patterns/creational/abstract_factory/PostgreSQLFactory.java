package com.omeraytekin.design_patterns.creational.abstract_factory;

public class PostgreSQLFactory implements DatabaseFactory {

    @Override
    public DatabaseConnection createConnection(String dbURL) {
        return new PostgreSQLConnection(dbURL);
    }

    @Override
    public DatabaseQuery createQuery() {
        return new PostgreSQLQuery();
    }
}
