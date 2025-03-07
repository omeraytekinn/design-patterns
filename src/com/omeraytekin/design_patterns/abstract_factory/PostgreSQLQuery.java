package com.omeraytekin.design_patterns.abstract_factory;

public class PostgreSQLQuery implements DatabaseQuery {

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing PostgreSQL query: " + query);
    }
}
