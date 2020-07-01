package br.com.dazo.pattern.gof.structural.proxy;

public interface ReportGenerator {

    void displayReportTemplate(String reportFormat,int reportEntries);

    void generateComplexReport(String reportFormat,int reportEntries);

    void generateSensitiveReport();
}
