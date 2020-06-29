package br.com.dazo.pattern.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CatalogComposite extends CatalogComponent {

    private List<CatalogComponent> items = new ArrayList<>();
    private String name;

    public CatalogComposite(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(name);
        for (CatalogComponent comp : items) {
            comp.print();
        }
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

}
