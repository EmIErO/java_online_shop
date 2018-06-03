import java.util.List;
import java.util.ArrayList;

public class PatternAnswers<E> {

    private List<String> patternAns;

    public PatternAnswers(List<E> list) {
        this.patternAns = new ArrayList<String>;
        this.createAnswerList(list);
    } 

    public List<String> getPatternAns() {
        return this.patternAns;
    }

    public void createAnswerList(List<E> list) {
        for (int i; i < list.size(); i++) {
            patternAns.add(String.valueOf(i + 1));
        }
    }

    public boolean validateChoosenOpt(String userAnswer) {
        return this.patternAns.contains(answer);
    }
}