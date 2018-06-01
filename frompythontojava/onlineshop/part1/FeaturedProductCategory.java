//package frompythontojava.onlineshop.part1;

import java.util.Date;
import java.util.Objects;

public class FeaturedProductCategory extends ProductCategory {
    private Date expirationDate;

    public FeaturedProductCategory(String name, Date expirationDate) {
        super(name);
        this.expirationDate = expirationDate;
    }


    public Date getDate() {
        return this.expirationDate;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "," + super.toString() + ",expiration date:" + this.expirationDate.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;

        if (!(o instanceof FeaturedProductCategory)) {
            return false;
        }
        FeaturedProductCategory category = (FeaturedProductCategory) o;
        return super.equals(category) && this.getDate().equals(category.getDate());
    }
} 