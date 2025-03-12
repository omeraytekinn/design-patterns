package com.omeraytekin.design_patterns.creational.prototype;

public interface SalesData {
    void prepareData();

    void printData();

    String getType();

    SalesData clone();
}
