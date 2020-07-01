package br.com.dazo.pattern.gof.structural.adapter;

/**
 * Adapter. Allows for two incompatible classes to work together by wrapping an interface around one of the existing classes.
 */
public class AdapterTest {

    public static void main(String[] args) {
        String testString = " Formatting line 1. Formatting line 2. Formatting line 3.";

        newLine(testString);

        cvsAdapter(testString);

    }

    private static void cvsAdapter(String testString) {
        CsvFormattable csvFormatter = new CsvFormatter();
        TextFormattable csvAdapter = new CsvAdapterImpl(csvFormatter);
        String resultCsvString = csvAdapter.formatText(testString);
        System.out.println(resultCsvString);
    }

    private static void newLine(String testString) {
        TextFormattable newLineFormatter = new NewLineFormatter();
        String resultString = newLineFormatter.formatText(testString);
        System.out.println(resultString);
    }
}
