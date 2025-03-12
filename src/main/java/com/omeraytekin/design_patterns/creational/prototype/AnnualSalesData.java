package com.omeraytekin.design_patterns.creational.prototype;

public class AnnualSalesData implements SalesData {
    private int year;
    private double sales;

    public AnnualSalesData(int year) {
        this.year = year;
        prepareData();
    }

    public AnnualSalesData(int year, double sales) {
        this.year = year;
        this.sales = sales;
    }

    private AnnualSalesData(AnnualSalesData data) {
        this.year = data.year;
        this.sales = data.sales;
    }

    @Override
    public void prepareData() {
        this.sales = fetchData(year);
    }

    @Override
    public void printData() {
        System.out.println("Year: " + year);
        System.out.println("Sales: " + sales);
    }

    @Override
    public String getType() {
        return "yearly-data";
    }

    @Override
    public SalesData clone() {
        return new AnnualSalesData(this);
    }

    // Stubbing api operation
    private double fetchData(int year) {
        return 100.0;
    }
}
