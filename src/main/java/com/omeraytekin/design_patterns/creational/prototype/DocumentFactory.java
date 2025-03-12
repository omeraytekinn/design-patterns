package com.omeraytekin.design_patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class DocumentFactory {
    private static Map<String, Document> prototypes;

    static {
        prototypes = new HashMap<>();
        SalesData monthlySalesData = new MothlySalesData("default-month", 0.0);
        SalesReport monthlySalesReport = new SalesReport("Default Monthly Sales Report", monthlySalesData);
        prototypes.put("monthly-sales", monthlySalesReport);

        SalesData annualSalesData = new MothlySalesData("default-year", 0.0);
        SalesReport annualSalesReport = new SalesReport("Default Annual Sales Report", annualSalesData);
        prototypes.put("annual-sales", annualSalesReport);

        SalesData regionalSalesData = new MothlySalesData("default-region", 0.0);
        SalesReport regionalSalesReport = new SalesReport("Default Regional Sales Report", regionalSalesData);
        prototypes.put("regional-sales", regionalSalesReport);
    }

    public static void registerPrototype(String key, Document document) {
        prototypes.put(key, document);
    }

    public static Document generateDocument(String key) {
        Document prototype = prototypes.get(key);
        if (prototype == null) {
            throw new IllegalArgumentException("No prototype registered with key: " + key);
        }
        return prototype.clone();
    }

    public static SalesReport createMonthlySalesReport(String month) {
        SalesReport report = (SalesReport) generateDocument("monthly-sales");
        report.setTitle("Sales Report for Month: " + month);
        report.setData(new MothlySalesData(month));
        return report;
    }

    public static SalesReport createRegionalSalesReport(String region) {
        SalesReport report = (SalesReport) generateDocument("regional-sales");
        report.setTitle("Sales Report for Region: " + region);
        report.setData(new RegionalSalesData(region));
        return report;
    }

    public static SalesReport createAnnualSalesReport(int year) {
        SalesReport report = (SalesReport) DocumentFactory.generateDocument("annual-sales");
        report.setTitle("Sales Data for Year: 2024");
        report.setData(new AnnualSalesData(year));
        return report;
    }
}
