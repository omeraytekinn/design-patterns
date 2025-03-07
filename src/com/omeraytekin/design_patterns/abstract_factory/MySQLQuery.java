package com.omeraytekin.design_patterns.abstract_factory;

public class MySQLQuery implements DatabaseQuery {

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing MySQL query: " + query);
    }
}
