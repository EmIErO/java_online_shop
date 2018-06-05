package frompythontojava.onlineshop.part3;

import java.util.List;
import java.util.ArrayList;

public class PatternAnswers<E> {

    private List<String> patternAns;

    public PatternAnswers(List<E> list) {
        this.patternAns = new ArrayList<String>();
        this.createAnswerList(list);
    } 

    public List<String> getPatternAns() {
        return this.patternAns;
    }

    public void createAnswerList(List<E> list) {
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
}