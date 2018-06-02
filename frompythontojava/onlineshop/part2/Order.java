//package frompythontojava.onlineshop.part2;

public class Order implements Orderable {

    private int id;
    private String status;

    public static Integer numberOfOrders = 0;

    public Order() {
        this.status = "new";
        this.id = ++numberOfOrders;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean checkout() {
        if (this.status.equals("new")) {
            this.status = "checked";
            return true;
        }
        else {
            return false;
        }
    }

    public boolean pay() {
        if (this.status.equals("checked")) {
            this.status = "payed";
            return true;
        }
        else {
            return false;
        }
    }

}