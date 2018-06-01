import java.lang.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Basket{
    private Iterator iterator;
    private List<Product> productList;

    public Basket() {
        this.productList = new ArrayList<Product>;
        this.iterator = new ProductIterator(productList);
    }

}