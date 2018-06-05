package frompythontojava.onlineshop.part3;

import frompythontojava.onlineshop.part1.*;
import frompythontojava.onlineshop.part2.*;

import java.util.*;

public class Options implements UserInput {

    private List<String> currentOptions;
    private PatternAnswers currentPatternAns;
    private List<String> userInput;
    private String currentUserAns;
    private int currentOption;

    private Scanner reader;

    public Options() {
        this.currentOptions = new ArrayList<String>();
        this.userInput = new ArrayList<String>();
        this.reader = new Scanner(System.in);
    }

    public int getCurrentOption() {
        return this.currentOption;
    }

    public String getCurrentUserAns() {
        return this.currentUserAns;
    }

    public List<String> getCurrentOptions() {
        return this.currentOptions;
    }

    public PatternAnswers getCurrentPatternAns() {
        return this.currentPatternAns;
    }

    public List<String> getUserInput() {
        return this.userInput;
    }

    public void setCurrentOptionsAndAnswers(List<String> options) {
        this.currentOptions = options;
        this.currentPatternAns = new PatternAnswers(options);
    }

    private int convertToInt(String userAns) throws NumberFormatException {
        return Integer.parseInt(userAns);
    }

    public void getValidUserAns() {
        do {                                                                    
            this.currentUserAns = this.reader.nextLine();
        } while (!currentPatternAns.validateChoosenOpt(this.currentUserAns));
            this.currentOption = convertToInt(this.currentUserAns);
    }

    public Date getValidDateAns() throws NumberFormatException {
        List<Integer> dataForDate = new ArrayList<Integer>();
        for (String input: this.userInput) {
            dataForDate.add(Integer.parseInt(input));
        }
        return (new GregorianCalendar(dataForDate.get(0), (dataForDate.get(1) - 1), dataForDate.get(2)).getTime());
    }

    public void getUserInput(List<String> requirements) {
        this.userInput.clear();
        for (String requirement: requirements) {
            System.out.println(requirement);
            this.userInput.add(reader.nextLine());
        }
        System.out.println(this.userInput);
    }

}
// Arrays.asList("Isert year\n", "Insert month\n", "Insert day\n");