//package frompythontojava.onlineshop.part2;

public class Main {

    public static void main(String[] args) {
        
        Order o1 = new Order();
        Order o2 = new Order();
        Order o3 = new Order();

        System.out.println(o1.getStatus());
        System.out.println(o2.getStatus());
        System.out.println(o3.getStatus());
        System.out.println("\n");

        CheckoutProcess testCHprocess = new CheckoutProcess();
        PaymentProcess testPprocess = new PaymentProcess();

        testCHprocess.process(o1);
        System.out.println(o1.getStatus());
        testPprocess.process(o1);
        System.out.println(o1.getStatus());
        System.out.println("\n");

        testPprocess.process(o2);
        System.out.println(o2.getStatus());
        testCHprocess.process(o2);
        System.out.println(o2.getStatus());
        testPprocess.process(o2);
        System.out.println(o2.getStatus());
        testCHprocess.process(o2);
        System.out.println(o2.getStatus());
        System.out.println("\n");

        testCHprocess.process(o3);
        System.out.println(o3.getStatus());
        testPprocess.process(o3);
        System.out.println(o3.getStatus());
        testPprocess.process(o3);
        System.out.println(o3.getStatus());
        System.out.println("\n");
    }
}
