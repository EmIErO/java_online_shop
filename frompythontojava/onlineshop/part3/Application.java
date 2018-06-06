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

    private HandleOptions currentOptions;

    public static void main(String[] args) {
	    Application app = new Application();
        app.runApp();
    }

    public Application() {
        this.categories = new ArrayList<ProductCategory>();
        this.baskets = new ArrayList<Basket>();
        this.currentOptions = new HandleOptions();
    }

    private void runApp() {
        while (isRunning) {
            this.currentOptions.setPatternOpt(new Options(Arrays.asList("Create new product", 
                                                                        "Create new product category", 
                                                                        "Basket", 
                                                                        "List of products from choosen category", 
                                                                        "Availability of choosen product")));
            printMenu(); 
            addOption("0. Exit\n", "0");
            this.currentOptions.getValidUserAns();                                
            chooseMainOption();
            
        }
    }
    private void printMenu() {
        this.currentOptions.getPatternOpt().printList(currentOptions.getPatternOpt().getOptions());
    }

    private void addOption(String name, String value) {
        System.out.println(name);
        this.currentOptions.getPatternOpt().addAnswer(value);
    }

    private void chooseMainOption() {
        switch (this.currentOptions.getCurrentOption()) {
                case 1:
                    currentOptions.setPatternOpt(new Options(Arrays.asList("Deflaut product", 
                                                                            "New defined product")));
                    printMenu();
                    this.currentOptions.getValidUserAns();
                    chooseProduct();
                    break;
                case 2:
                    currentOptions.setPatternOpt(new Options(Arrays.asList("New deflaut product category", 
                                                                            "New product category", 
                                                                            "New featured product category")));
                    printMenu();
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
                    this.currentOptions.getUserInput(Arrays.asList("Insert product's name:\n", "Insert product's price:\n"));
                    try {
                        selectCategory();
                        getValidProductAns();
                        System.out.println("New product has been created.\n");
                    } catch (NumberFormatException e1) {
                        System.out.println("\t Wrong input for price. Use numbers separated with a dot /0.00/.\n");
                    } catch (IllegalArgumentException e2) {
                        System.out.println("\t There are no categories to choose from. Add new category first.\n");
                    }
                    break;
        }
    }

    private void chooseCategory() {
        switch (this.currentOptions.getCurrentOption()) {
                case 1:
                    //ProductCategory newCategory = new ProductCategory();
                    this.categories.add(new ProductCategory());
                    System.out.println("New deflaut product category has been created.\n");
                    break;
                case 2:
                    this.currentOptions.getUserInput(Arrays.asList("Insert new category's name:\n"));
                    this.categories.add(new ProductCategory(this.currentOptions.getCurrentUserInput().get(FIRST_ON_LIST)));
                    System.out.println("New product category has been created.\n");
                    break;
                case 3:
                    this.currentOptions.getUserInput(Arrays.asList("Insert new category's name:\n"));
                    Date newDate = createNewDate();
                    this.categories.add(new FeaturedProductCategory(this.currentOptions.getCurrentUserInput().get(FIRST_ON_LIST), newDate));
                    System.out.println("New featured product category has been created.\n");
        }
    }
    
    private void selectCategory() throws IllegalArgumentException {
        if (this.categories.isEmpty()) {
            System.out.println("Categories' list is empty. \n");
            throw new IllegalArgumentException();
        } else {
            System.out.println("Select category: \n");
            currentOptions.setPatternOpt(new Options(this.categories));
            printMenu();
            this.currentOptions.getValidUserAns();
        }
        
    }

    private Product getValidProductAns() throws NumberFormatException {
        String name = this.currentOptions.getCurrentUserInput().get(FIRST_ON_LIST);
        Float price = Float.parseFloat(currentOptions.getCurrentUserInput().get(SECOND_ON_LIST));
        ProductCategory category = this.categories.get(currentOptions.getCurrentOption());
        return (new Product(name, price, category));
    }

    public Date getValidDateAns() throws NumberFormatException {
        List<Integer> dataForDate = new ArrayList<Integer>();
        for (String input: currentOptions.getCurrentUserInput()) {
            dataForDate.add(Integer.parseInt(input));
        }
        return (new GregorianCalendar(dataForDate.get(0), (dataForDate.get(1) - 1), dataForDate.get(2)).getTime());
    }

    private Date createNewDate() {    
        Date newDate = null;
        boolean hasNewDate = false;
        while (!hasNewDate) {
            this.currentOptions.getUserInput(Arrays.asList("Insert year:\n", "Insert month:\n", "Insert day:\n"));
            try {
                newDate = getValidDateAns();
                System.out.println(newDate.toString());
                hasNewDate = true;
                
            } catch (NumberFormatException e) {
                System.out.println("\t Wrong input for date object.\n");
            }
        }
        return newDate;
    }
    
}

// "Add products to the basket", "Remove products from the basket","See products in the basket",
