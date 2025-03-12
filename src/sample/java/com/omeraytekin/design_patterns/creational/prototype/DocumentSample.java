package com.omeraytekin.design_patterns.creational.prototype;

public class DocumentSample {
    public static void main(String[] args) {
        SalesReport januarySalesReport = DocumentFactory.createMonthlySalesReport("January");
        januarySalesReport.generate();

        SalesReport previousYearSalesReport = DocumentFactory.createAnnualSalesReport(2024);
        previousYearSalesReport.generate();

        SalesReport izmirSalesReport = DocumentFactory.createRegionalSalesReport("İzmir");
        izmirSalesReport.generate();

    }
}
