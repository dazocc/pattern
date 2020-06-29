package br.com.dazo.pattern.gof.creational.prototype;

import javax.print.Doc;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class DocumentManager {

    private static Map<DocumentType, Document> prototypes = new HashMap<>();

    static {

        montaAgreement();

        montaAuthorized();
    }

    private static void montaAuthorized() {
        Authorized authorized = new Authorized();
        authorized.setCreate(LocalDateTime.of(LocalDate.of(2020, 1, 1), LocalTime.MIN));
        authorized.setName("Andrew Clark");
        authorized.setDesignation("Operation Head");
        prototypes.put(DocumentType.AUTHORIZED, authorized);
    }

    private static void montaAgreement() {
        Agreement agreement = new Agreement();
        agreement.setCreate(LocalDateTime.of(LocalDate.of(2020, 1, 15), LocalTime.MIN));
        agreement.setContent("Please read and accept the terms and conditions...");
        prototypes.put(DocumentType.AGREEMENT, agreement);
    }

    public static Document getClonedDocument(final DocumentType type) {

        Document clonedDoc = null;

        try {
            Document doc = prototypes.get(type);
            clonedDoc = doc.cloneDocument();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clonedDoc;
    }
}
