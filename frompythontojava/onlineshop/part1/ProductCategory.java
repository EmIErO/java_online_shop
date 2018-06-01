public class ProductCategory {
    private String name;
    private Integer ID;
    private static numberOfProducts = 0;

    public ProductCategory() {
        this.name = "Category";
        this.ID = ++numberOfProducts;
    }

    public ProductCategory(String name) {
        this.name = name;
        this.ID = ++numberOfProducts;
    }

}