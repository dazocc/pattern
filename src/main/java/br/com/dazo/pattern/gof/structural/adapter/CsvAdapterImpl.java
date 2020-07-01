package br.com.dazo.pattern.gof.structural.adapter;

public class CsvAdapterImpl implements TextFormattable {

    private CsvFormattable csvFormatter;

    public CsvAdapterImpl(CsvFormattable csvFormatter) {
        this.csvFormatter = csvFormatter;
    }

    @Override
    public String formatText(String text) {
        String formattedText = csvFormatter.formatCsvText(text);
        return formattedText;
    }
}