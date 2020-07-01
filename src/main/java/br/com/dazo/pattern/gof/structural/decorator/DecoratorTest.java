package br.com.dazo.pattern.gof.structural.decorator;

/**
 * Decorator. Allows for an object’s behavior to be extended dynamically at run time.
 */
public class DecoratorTest {

    public static void main(String[] args) {
        FlowerBouquet roseBouquet = new RoseBouquet();
        System.out.println(roseBouquet.getDescription() + " $ " + roseBouquet.cost());

        mountRose();
        mountOrchid();
    }

    private static void mountOrchid() {
        /*Rose bouquet with paper wrapper, ribbon bow, and glitter*/
        FlowerBouquet decoratedOrchidBouquet = new OrchidBouquet();
        decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new RibbonBow(decoratedOrchidBouquet);

        System.out.println(decoratedOrchidBouquet.getDescription() + " $ " + decoratedOrchidBouquet.cost());
    }

    private static void mountRose() {
        /*Orchid bouquet with double paper wrapper and ribbon bow*/
        FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
        decoratedRoseBouquet = new PaperWrapper(decoratedRoseBouquet);
        decoratedRoseBouquet = new RibbonBow(decoratedRoseBouquet);
        decoratedRoseBouquet = new Glitter(decoratedRoseBouquet);
        System.out.println(decoratedRoseBouquet.getDescription() + " $ " + decoratedRoseBouquet.cost());
    }
}
