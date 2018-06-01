import java.lang.*;
import java.util.ArrayList;

public class Product {
    private String name;
    private Float defaultPrice;
    private ProductCategory productCategory;
    private Integer ID;

    public static List<Product> productList = new ArrayList<Product>();
    public static Integer numberOfProducts = 0;


    public Product() {
        this.name = defaultName;
        this.defaultPrice = 0.00;
        this.productCategory = new ProductCategory();
        this.ID = ++numberOfProducts;

        this.productList.add(this);
    }

    public Product(String name, Float defaultPrice, ProductCategory productCategory) {
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.productCategory = productCategory;
        this.ID = ++numberOfProducts;

        this.productList.add(this);
    }

    public String toString() {
        return "product ID:" + this.ID + ",name:" + this.name + ",deflaut price:" + this.defaultPrice + "," + this.productCategory.toString();
    }
}