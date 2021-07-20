import java.util.List;

public class Q1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        int index = 0;
        switch(ruleKey){
            case "type" : index =0; break;
            case "color" : index =1; break;
            case "name" : index = 2; break;
        }
        for(List l :items){
            if(l.get(index).equals(ruleValue)) result++;
        }
        return result;
    }
}
