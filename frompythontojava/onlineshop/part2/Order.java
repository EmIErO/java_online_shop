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
            return false;
        }
        else {
            return true;
        }
    }

    public boolean pay() {
        if (this.status.equals("new")) {
            return false;
        }
        if (this.status.equals("checked")) {
            this.status = "payed";
            return false;
        }
        else {
            return true;
        }
    }

}