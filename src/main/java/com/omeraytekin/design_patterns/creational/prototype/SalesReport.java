package com.omeraytekin.design_patterns.creational.prototype;

public class SalesReport implements Document {
    private String title;
    private SalesData salesData;

    public SalesReport(String title, SalesData salesData) {
        this.title = title;
        this.salesData = salesData;
    }

    private SalesReport(SalesReport report) {
        this.title = report.title;
        this.salesData = report.salesData;
    }

    public void setData(SalesData salesData) {
        this.salesData = salesData;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void generate() {
        System.out.println("[Generating Sales Report]");
        System.out.println("Title: " + title);
        salesData.printData();
    }

    @Override
    public Document clone() {
        return new SalesReport(this);
    }
}
