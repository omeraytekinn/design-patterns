package com.omeraytekin.design_patterns.creational.abstract_factory;

public interface DatabaseFactory {
    DatabaseConnection createConnection(String dbURL);

    DatabaseQuery createQuery();
}
