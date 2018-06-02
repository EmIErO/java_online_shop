//package frompythontojava.onlineshop.part2;

public class PaymentProcess extends AbstractProcess {

    protected action(Orderable item) {
        if (item.pay()) {
            System.out.println("Payed sucessfully");
        } else {
            System.out.println("Alredy payed.");
        }

    }
}