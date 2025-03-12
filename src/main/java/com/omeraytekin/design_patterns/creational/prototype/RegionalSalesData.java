package com.omeraytekin.design_patterns.creational.prototype;

public class RegionalSalesData implements SalesData {
    private String region;
    private double sales;

    public RegionalSalesData(String region) {
        this.region = region;
        prepareData();
    }

    public RegionalSalesData(String region, double sales) {
        this.region = region;
        this.sales = sales;
    }

    private RegionalSalesData(RegionalSalesData data) {
        this.region = data.region;
        this.sales = data.sales;
    }

    @Override
    public void prepareData() {
        this.sales = fetchData(region);
    }

    @Override
    public void printData() {
        System.out.println("Region: " + region);
        System.out.println("Sales: " + sales);
    }

    @Override
    public String getType() {
        return "regional-data";
    }

    @Override
    public SalesData clone() {
        return new RegionalSalesData(this);
    }

    // Stubbing api operation
    private double fetchData(String region) {
        return 100.0;
    }
}
