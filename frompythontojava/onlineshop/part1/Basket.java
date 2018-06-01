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

    public Iterator getIterator() {
        return this.iterator;
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public Boolean removeProduct(Product product) {
        while (this.iterator.hasNext()) {
            Product tempProduct = iterator.next();
            if (tempProduct.equals(product)) {
                iterator.remove();
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

}