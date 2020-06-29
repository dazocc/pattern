package br.com.dazo.pattern.gof.structural.composite;

/*Composite. Takes a group of objects into a single object.*/
public class CompositeTest {

    public static void main(String[] args) {
        

        CatalogComponent mJeanCatalogLeaf=new CatalogLeaf("M: Jeans 32", 65.00);
        CatalogComponent mTShirtCatalogLeaf=new CatalogLeaf("M: T Shirt 38", 45.00);

        CatalogComponent newCatalog = new CatalogComposite("Female CatalogLeafs");
        CatalogComponent fJeans=new CatalogLeaf("F: Jeans 32", 65.00);
        CatalogComponent fTShirts=new CatalogLeaf("F: T Shirt 38", 45.00);
        newCatalog.add(fJeans);
        newCatalog.add(fTShirts);


        CatalogComponent kidCatalog = new CatalogComposite("Kids CatalogLeafs");
        CatalogComponent kidShorts=new CatalogLeaf("Shorts", 23.00);
        CatalogComponent kidPlayGears = new CatalogLeaf("Play Gear", 65.00);
        kidCatalog.add(kidShorts);
        kidCatalog.add(kidPlayGears);


        /*
        *                                    PRIMARY
        *               JEANS  TSHIRT          KID                  FEMALE
        *                               Shorts  Play Gear        Jeans TShirt
        * */
        CatalogComponent mainCatalog=new CatalogComposite("Primary Catalog");
        mainCatalog.add(mJeanCatalogLeaf);
        mainCatalog.add(mTShirtCatalogLeaf);
        mainCatalog.add(newCatalog);
        mainCatalog.add(kidCatalog);
        /*Print out CatalogLeaf/catalog information*/
        mainCatalog.print();
    }
}
