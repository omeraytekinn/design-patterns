package com.omeraytekin.design_patterns.creational.singleton;

import com.omeraytekin.design_patterns.creational.abstract_factory.DatabaseFactory;
import com.omeraytekin.design_patterns.creational.abstract_factory.DatabaseQuery;
import com.omeraytekin.design_patterns.creational.abstract_factory.PostgreSQLFactory;

public class SingletonSample {
    public static void main(String[] args) {
        initContext();

        GlobalApplicationContext context = GlobalApplicationContext.getInstance();
        ConfigurationManager configurationManager = context.getBean(ConfigurationManager.class);

        DatabaseFactory dbFactory = new PostgreSQLFactory();

        String dbURL = configurationManager.getConfig("db_url");
        dbFactory.createConnection(dbURL);
        DatabaseQuery dbQuery = dbFactory.createQuery();
        dbQuery.executeQuery("SELECT 'HELLO WORLD';");
    }

    private static void initContext() {
        GlobalApplicationContext context = GlobalApplicationContext.getInstance();
        context.registerBean(ConfigurationManager.class, ConfigurationManager.getInstance());
    }
}
