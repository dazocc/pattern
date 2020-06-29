package br.com.dazo.pattern.gof.creational.prototype;

public class Agreement extends Document {

    @Override
    public Document cloneDocument() throws CloneNotSupportedException {
        Agreement agreement = null;

        try {
            agreement = (Agreement) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return agreement;
    }

}
