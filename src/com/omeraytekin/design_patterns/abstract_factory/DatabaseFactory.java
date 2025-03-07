package com.omeraytekin.design_patterns.abstract_factory;

public interface DatabaseFactory {
    DatabaseConnection createConnection(String dbURL);

    DatabaseQuery createQuery();
}
