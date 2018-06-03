package frompythontojava.onlineshop.part1;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Objects;

public class Basket{
    private Iterator iterator;
    private List<Product> productList;

    public Basket() {
        this.productList = new ArrayList<Product>();
        this.iterator = new ProductIterator(productList);
    }

    public Iterator getIterator() {
        return this.iterator;
    }

    public List<Product> getProductList() {
        return this.productList;
    }

    public void setIterator(ProductIterator iterator) {
        this.iterator = iterator;
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    // public Boolean removeProduct(Product product) {
    //     this.iterator = new ProductIterator(this.productList);
    //     if (this.productList.contains(product)) {
    //         this.productList.remove(product);
    //         return true;
    //     }
    //     return false;
    //}
    
    public Boolean removeProduct(Product product) {
        this.iterator = new ProductIterator(this.productList);

        while (this.iterator.hasNext()) {
            Product tempProduct = (Product) this.iterator.next();
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