package frompythontojava.onlineshop.part3;

import frompythontojava.onlineshop.part1.*;
import frompythontojava.onlineshop.part2.*;

import java.util.*;

public class HandleOptions implements UserInput {

    //private List<String> currentOptions;    //
    private Options patternOpt;
    private List<String> currentUserInput;
    private String currentUserAns;
    private int currentOption;

    private Scanner reader;

    public HandleOptions() {
        this.currentUserInput = new ArrayList<String>();
        this.reader = new Scanner(System.in);
        this.patternOpt = new Options();
    }

    public int getCurrentOption() {
        return this.currentOption;
    }

    public String getCurrentUserAns() {
        return this.currentUserAns;
    }

    public Options getPatternOpt() {
        return this.patternOpt;
    }
    public void setPatternOpt(Options patternOpt) {
        this.patternOpt = patternOpt;
    }

    public List<String> getCurrentUserInput() {
        return this.currentUserInput;
    }

    private int convertToInt(String userAns) throws NumberFormatException {
        return Integer.parseInt(userAns);
    }

    public void getValidUserAns() {
        do {                                                                    
            this.currentUserAns = this.reader.nextLine();
        } while (!patternOpt.validateChoosenOpt(this.currentUserAns));
            this.currentOption = convertToInt(this.currentUserAns);
    }

    public void getUserInput(List<String> requirements) {
        this.currentUserInput.clear();
        for (String requirement: requirements) {
            System.out.println(requirement);
            this.currentUserInput.add(reader.nextLine());
        }
    }

}
// Arrays.asList("Isert year\n", "Insert month\n", "Insert day\n");