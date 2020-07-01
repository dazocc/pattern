package br.com.dazo.pattern.gof.structural.proxy;

/**
 * Proxy. Provides a placeholder interface to an underlying object to control access, reduce cost, or reduce complexity.
 */
public class ProxyTest {

    public static void main(String[] args) {

        Role accessRoleManager = new Role("Manager");
        Role accessRoleWorker = new Role("Worker");

        generate(accessRoleWorker);
        generate(accessRoleManager);

    }

    private static void generate(Role accessRole) {
        ReportGenerator proxy = new ReportGeneratorImplProxy(accessRole, new ReportGeneratorImpl());
        proxy.displayReportTemplate("Pdf", 150);
        proxy.generateComplexReport("Pdf", 150);
        proxy.generateSensitiveReport();
        System.out.println("END!!");
    }
}
