package br.com.dazo.pattern.gof.structural.proxy;

public class ReportGeneratorImpl implements ReportGenerator {

    public ReportGeneratorImpl(){
        System.out.println("Instance created");
    }

    @Override
    public void displayReportTemplate(String reportFormat, int reportEntries) {
        System.out.println("displayReportTemplate");
    }

    @Override
    public void generateComplexReport(String reportFormat, int reportEntries) {
        System.out.println("generateComplexReport");
    }

    @Override
    public void generateSensitiveReport() {
        System.out.println("generateSensitiveReport");
    }
}
