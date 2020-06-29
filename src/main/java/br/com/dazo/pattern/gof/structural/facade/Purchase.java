package br.com.dazo.pattern.gof.structural.facade;

import java.math.BigDecimal;

public class Purchase {

    private BigDecimal value;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
