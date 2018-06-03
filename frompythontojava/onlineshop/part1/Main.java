package frompythontojava.onlineshop.part1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        

        ProductCategory electronics = new ProductCategory("Electronics");

        Product t1 = new Product();
        Product t2 = new Product("DVD", new Float(30.25), electronics);
        Product t3 = new Product("Laptop", new Float(50.25), electronics);
        Product t4 = new Product("Cheese", new Float(1.25), new FeaturedProductCategory("Food", new Date(2018, 10, 1)));
        Product t5 = new Product("Bread", new Float(3.75), new FeaturedProductCategory("Food", new Date(2018, 6, 28)));
        Product t6 = new Product("Something", new Float(100.75), new ProductCategory());

        for (Product product: Product.getAllProducts()) {
            System.out.println(product.toString());
        }
        System.out.println("\n\nNew new new\n");

        System.out.println(t2.getAllProductsBy(electronics).toString());
        System.out.println("\n\nNew in the basket\n");

        Basket testBasket = new Basket();

        for (Product product: Product.getAllProducts()) {
            testBasket.addProduct(product);
        }
        Iterator bIt = testBasket.getIterator();
        while (bIt.hasNext()) {
            Product product = (Product) bIt.next();
            System.out.println(product.toString());
        }
        Product t0 = new Product();
            

        System.out.println("\n\nMay work...\n");
        
        if (testBasket.removeProduct(t3)) {
            System.out.println("Removed sucessfully");
            testBasket.setIterator(new ProductIterator(testBasket.getProductList()));

            while (testBasket.getIterator().hasNext()) {
                Product product = (Product) testBasket.getIterator().next();
                System.out.println(product.toString());
            }
        } else {
            System.out.println("Wasn't on list");
        }


        
        
    }
}
