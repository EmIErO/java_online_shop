package frompythontojava.onlineshop.part3;

import frompythontojava.onlineshop.part1.*;
import frompythontojava.onlineshop.part2.*;

import java.util.*;

public class Application {

    private List<ProductCategory> categories;

    private Scanner reader;

    public static void main(String[] args) {
	// write your code here
    }

    public Application() {}

    private void printMenu(List<String> options) {
        int number = 1;
        for (String option: options) {
            System.out.println(number + ". " + option);
            number++;
        }
    }

    private boolean validateChoosenOpt(List<String> answers; String userAnswer) {
        return answers.contains(answer);
    }

    private List<String> createAnswerList()
}
