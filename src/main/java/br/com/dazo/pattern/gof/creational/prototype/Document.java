package br.com.dazo.pattern.gof.creational.prototype;

import java.time.LocalDateTime;

public abstract class Document implements Cloneable {

    private LocalDateTime create;

    private String content;

    public LocalDateTime getCreate() {
        return create;
    }

    public void setCreate(LocalDateTime create) {
        this.create = create;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public abstract Document cloneDocument() throws CloneNotSupportedException;

    @Override
    public String toString() {
        return "[" + this.getClass().getCanonicalName() + ": Create - " + getCreate() + ", Content - " + getContent() + "]";
    }
}
