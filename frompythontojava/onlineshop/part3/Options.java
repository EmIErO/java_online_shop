package frompythontojava.onlineshop.part3;

import java.util.List;
import java.util.ArrayList;

public class Options<E> {

    private List<E> options;
    private List<String> patternAns;

    public Options() {
        this.patternAns = new ArrayList<String>();        
    }

    public Options(List<E> list) {
        this.options = list;
        this.patternAns = new ArrayList<String>();        
        createAnswerList(list);
    } 

    public List<String> getPatternAns() {
        return this.patternAns;
    }

    public List<E> getOptions() {
        return this.options;
    }
    
    public void setOptionsAndAnswers(List<E> list) {
        this.options = list;
        createAnswerList(list);
    }

    public void createAnswerList(List<E> list) {
        patternAns.clear();
        for (int i = 1; i <= list.size(); i++) {
            patternAns.add(String.valueOf(i));
        }
    }

    public void addAnswer(String answer) {
        this.patternAns.add(answer);
    }

    public boolean validateChoosenOpt(String userAnswer) {
        return this.patternAns.contains(userAnswer);
    }

    public void printList(List<E> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i).toString() + "\n");
        }
    }
}