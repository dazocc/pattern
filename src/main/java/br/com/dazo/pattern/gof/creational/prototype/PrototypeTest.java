package br.com.dazo.pattern.gof.creational.prototype;

/**
 * PrototypeTest. Creates a new object from an existing object.
 * */
public class PrototypeTest {

    public static void main(String[] args) {
        Document cloneAgreement = DocumentManager.getClonedDocument(DocumentType.AGREEMENT);
        cloneAgreement.setContent("Teste");
        System.out.println(cloneAgreement);

        Document clonedAuthorized = DocumentManager.getClonedDocument(DocumentType.AUTHORIZED);
        clonedAuthorized.setContent("Teste 2");
        System.out.println(clonedAuthorized);
    }
}
