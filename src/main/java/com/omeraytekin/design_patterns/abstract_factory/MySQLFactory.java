package com.omeraytekin.design_patterns.abstract_factory;

public class MySQLFactory implements DatabaseFactory {

    @Override
    public DatabaseConnection createConnection(String dbURL) {
        return new MySQLConnection(dbURL);
    }

    @Override
    public DatabaseQuery createQuery() {
        return new MySQLQuery();
    }
}
