package br.com.dazo.pattern.gof.creational.prototype;

public class Authorized extends Document {

    private String designation;

    private String name;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Document cloneDocument() throws CloneNotSupportedException {
        Authorized authorized = null;

        try {
            authorized = (Authorized) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return authorized;
    }

}
