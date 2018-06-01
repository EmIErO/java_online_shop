//package frompythontojava.onlineshop.part1;

import java.lang.*;
import java.util.Objects;

public class ProductCategory {
    private String name;
    private Integer ID;
    private static int numberOfCategories = 0;

    public ProductCategory() {
        this.name = "Category";
        this.ID = ++numberOfCategories;
    }

    public ProductCategory(String name) {
        this.name = name;
        this.ID = ++numberOfCategories;
    }

    public String getName() {
        return this.name;
    }

    public Integer getID() {
        return this.ID;
    } 

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "category's name:" + this.name + "," + "category ID:" + this.ID;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;

        if (!(o instanceof ProductCategory)) {
            return false;
        }
        ProductCategory category = (ProductCategory) o;
        return this.getName().equals(category.getName()) && this.getID().equals(category.getID());
    }
    
}