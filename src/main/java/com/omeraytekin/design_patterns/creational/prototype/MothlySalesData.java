package com.omeraytekin.design_patterns.creational.prototype;

public class MothlySalesData implements SalesData {
    private String month;
    private double sales;

    public MothlySalesData(String month) {
        this.month = month;
        prepareData();
    }

    public MothlySalesData(String month, double sales) {
        this.month = month;
        this.sales = sales;
    }

    private MothlySalesData(MothlySalesData data) {
        this.month = data.month;
        this.sales = data.sales;
    }

    @Override
    public void prepareData() {
        this.sales = fetchData(month);
    }

    @Override
    public void printData() {
        System.out.println("Month: " + month);
        System.out.println("Sales: " + sales);
    }

    @Override
    public String getType() {
        return "monthly-data";
    }

    @Override
    public SalesData clone() {
        return new MothlySalesData(this);
    }

    // Stubbing api operation
    private double fetchData(String month) {
        return 100.0;
    }
}
