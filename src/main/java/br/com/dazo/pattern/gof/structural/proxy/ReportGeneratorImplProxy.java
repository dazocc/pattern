package br.com.dazo.pattern.gof.structural.proxy;

public class ReportGeneratorImplProxy implements ReportGenerator {

    private ReportGenerator reportGeneratorImpl;

    private Role accessRole;

    public ReportGeneratorImplProxy(Role accessRole, ReportGenerator reportGeneratorImpl) {
        this.accessRole = accessRole;
        this.reportGeneratorImpl = reportGeneratorImpl;
    }

    @Override
    public void displayReportTemplate(String reportFormat, int reportEntries) {
        if (reportGeneratorImpl != null) {
            reportGeneratorImpl.displayReportTemplate(reportFormat, reportEntries);
        }
    }

    @Override
    public void generateComplexReport(String reportFormat, int reportEntries) {
        if (reportGeneratorImpl != null) {
            reportGeneratorImpl.generateComplexReport(reportFormat, reportEntries);
        }
    }

    @Override
    public void generateSensitiveReport() {
        if ("Manager".equals(accessRole.getRole()) &&
                reportGeneratorImpl != null) {
            reportGeneratorImpl.generateSensitiveReport();
        } else {
            System.out.println("You are not authorized to access sensitive reports.");
        }
    }
}
