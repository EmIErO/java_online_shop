package frompythontojava.onlineshop.part1;

import java.lang.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Product {
    private String name;
    private Float defaultPrice;
    private ProductCategory productCategory;
    private Integer ID;

    public static List<Product> productList = new ArrayList<Product>();
    public static Integer numberOfProducts = 0;


    public Product() {
        this.name = "defaultName";
        this.defaultPrice = new Float(0);
        this.productCategory = new ProductCategory();
        this.ID = ++numberOfProducts;

        productList.add(this);
    }

    public Product(String name, Float defaultPrice, ProductCategory productCategory) {
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.productCategory = productCategory;
        this.ID = ++numberOfProducts;

        productList.add(this);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getDefaultPrice() {
        return this.defaultPrice;
    }

    public void setDefaultPrice(Float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Integer getID() {
        return this.ID;
    }

    public ProductCategory getProductCategory() {
        return this.productCategory;
    }

    public String toString() {
        return "product ID:" + this.ID + ",name:" + this.name + ",deflaut price:" + this.defaultPrice + "," + this.productCategory.toString();
    }

    public static List<Product> getAllProducts() {
        return productList;
    }

    public List<Product> getAllProductsBy(ProductCategory productCategory) {
        List<Product> productsByCategory = new ArrayList<Product>();

        for (Product product: productList) {
            if (product.getProductCategory().getName().equals(productCategory.getName())) {
                productsByCategory.add(product);
            } else {
                continue;
            }
        }
        return productsByCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;

        if (!(o instanceof Product)) {
            return false;
        } 
        Product product = (Product) o;
        
        return this.getName().equals(product.getName()) && this.getDefaultPrice().equals(product.getDefaultPrice())
                && this.getProductCategory().equals(product.getProductCategory()) && this.getID().equals(product.getID());
    }

}
