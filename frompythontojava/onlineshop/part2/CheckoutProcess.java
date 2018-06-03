package frompythontojava.onlineshop.part2;

public class CheckoutProcess extends AbstractProcess {

    protected void action(Orderable item) {
        if (item.checkout()) {
            System.out.println("Checkout: done.");
        } else {
            System.out.println("Can't checkout again.");
        }
    }
}