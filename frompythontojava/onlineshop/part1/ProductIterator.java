package frompythontojava.onlineshop.part1;

import java.util.Iterator;
import java.util.List;

public class ProductIterator implements Iterator<Product> {
    private int index;
    private List<Product> products;

    private ProductIterator(List<Product> newProducts) {
        this.index = 0;
        this.products = newProducts;
    }

    @Override
    public boolean hasNext() {
        return index < products.size();

    }

    @Override
    public Question next() {
        return produsts.get(this.index++);
    }
    
}