//package frompythontojava.onlineshop.part1;

import java.util.Iterator;
import java.util.List;

public class ProductIterator implements Iterator<Product> {
    private int index;
    private List<Product> products;

    public ProductIterator(List<Product> newProducts) {
        this.index = 0;
        this.products = newProducts;
    }

    @Override
    public boolean hasNext() {
        return index < products.size();

    }

    @Override
    public Product next() {
        return products.get(this.index++);
    }

    @Override
    public void remove() {
        this.products.remove(this.index);
    }
    
}