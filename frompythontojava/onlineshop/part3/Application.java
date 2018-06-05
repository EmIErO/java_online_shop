package frompythontojava.onlineshop.part3;

import frompythontojava.onlineshop.part1.*;
import frompythontojava.onlineshop.part2.*;

import java.util.*;

public class Application {

    private final int FIRST_ON_LIST = 0;
    private final int SECOND_ON_LIST = 1;

    private boolean isRunning = true;

    private List<ProductCategory> categories;
    private List<Basket> baskets;

    private Options currentOptions;

    public static void main(String[] args) {
	    Application app = new Application();
        app.runApp();
    }

    public Application() {
        this.categories = new ArrayList<ProductCategory>();
        this.baskets = new ArrayList<Basket>();
        this.currentOptions = new Options();
    }

    private void runApp() {
        while (isRunning) {
            this.currentOptions.setCurrentOptionsAndAnswers(Arrays.asList("Create new product", "Create new product category", 
                                        "Create new featured product category", "Basket", 
                                         "List of products from choosen category", "Availability of choosen product"));
            printMenu(this.currentOptions.getCurrentOptions()); 
            addOption("0. Exit\n", "0");
            this.currentOptions.getValidUserAns();                                
            chooseMainOption();
            
        }
    }
    private void printMenu(List<String> options) {
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i) + "\n");
        }
    }

    private void addOption(String name, String value) {
        System.out.println(name);
        this.currentOptions.getCurrentPatternAns().addAnswer(value);
    }

    private void chooseMainOption() {
        switch (this.currentOptions.getCurrentOption()) {
                case 1:
                    currentOptions.setCurrentOptionsAndAnswers(Arrays.asList("Deflaut product", "New defined product"));
                    printMenu(this.currentOptions.getCurrentOptions());
                    this.currentOptions.getValidUserAns();
                    chooseProduct();
                    break;
                case 2:
                    currentOptions.setCurrentOptionsAndAnswers(Arrays.asList("Deflaut category", "New defined category"));
                    printMenu(this.currentOptions.getCurrentOptions());
                    this.currentOptions.getValidUserAns();
                    chooseCategory();
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                   
                    break;
                case 0:
                    isRunning = false;
                    break;

            }
    }

    private void chooseProduct() {
        switch (this.currentOptions.getCurrentOption()) {
                case 1:
                    Product newProduct = new Product();
                    System.out.println("New deflaut product has been created.\n");
                    break;
                case 2:
                    System.out.println("Works... ? \n");
                    this.currentOptions.getUserInput(Arrays.asList("Insert product's name\n", "Insert product's price\n"));
                    selectCategory();
                    try {
                        getValidProductAns();
                        System.out.println("New product has been created.\n");
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong input for price. Use numbers separated with a dot /0.00/.\n");
                    }

                    this.currentOptions.getUserInput(Arrays.asList("Insert year\n", "Insert month\n", "Insert day\n"));
                    try {
                        Date newDate = currentOptions.getValidDateAns();
                        System.out.println(newDate.getDay() + "." + newDate.getMonth() + "." + newDate.getYear() + "\n");
                        System.out.println(newDate.toString());
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong input for date object.\n");
                    }
                        
                        //Product(String name, Float defaultPrice, ProductCategory productCategory)
                    break;
        }
    }

    private void chooseProduct() {
        switch (this.currentOptions.getCurrentOption()) {
                case 1:
                    ProductCategory newCategory = new ProductCategory();
                    this.category.add(ProductCategory);
                    System.out.println("New product's category has been created.\n");
                    break;
                case 2:
                   
                    break;
        }
    }
    
    private void selectCategory() {
        if (this.categories.isEmpty()) {
            System.out.println("Categories' list is empty. \nCreate new category.");
        } else {
            System.out.println("Select category: \n");
            printMenu(this.categories);
            this.currentOptions.getValidUserAns();
        }
        
    }
    private Product getValidProductAns() throws NumberFormatException {
        String name = this.currentOptions.getUserInput.get(FIRST_ON_LIST);
        Flost price = Float.parseFloat(currentOptions.getUserInput.get(SECOND_ON_LIST));
        ProductCategory category = this.categories.get(currentOptions.getCurrentOption());
        return (new Product(name, price, category));
    }
}

// "Add products to the basket", "Remove products from the basket","See products in the basket",
