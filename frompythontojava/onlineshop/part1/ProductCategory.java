public class ProductCategory {
    private String name;
    private Integer ID;
    private static numberOfCategories = 0;

    public ProductCategory() {
        this.name = "Category";
        this.ID = ++numberOfCategories;
    }

    public ProductCategory(String name) {
        this.name = name;
        this.ID = ++numberOfCategories;
    }

    public String toString() {
        return "name:" + this.name + "," + "category ID:" + this.ID;
    }

}