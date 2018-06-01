import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {
    private Date expirationDate;

    public FeaturedProductCategory(String name, Date expirationDate) {
        super(name);
        this.expirationDate = expirationDate;
    }
} 