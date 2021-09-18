import java.util.ArrayList;
import java.util.List;

public class Q1002 {
    public List<String> commonChars(String[] words) {
        ArrayList<String> result = new ArrayList<>();
        //an int array with size of 26 to count character frequency
        int[] count = new int[26];
        //count character frequencies in first word, and put count in an int array
        for (int i = 0; i < words[0].length(); i++) {
            count[words[0].charAt(i) - 'a']++;
        }
        //for each word, start from second word
        for (int i = 1; i < words.length; i++) {
            int[] temp = new int[26];
            //count character frequencies and put result into a temp array
            for (int j = 0; j < words[i].length(); j++) {
                temp[words[i].charAt(j) - 'a']++;
            }
            //compare frequencies in temp and count
            for (int j = 0; j < 26; j++) {
                //if temp[j]==0, that means this character cannot be the common character
                //if temp[j] and count[j] are both greater than 0, that means there will be common characters of temp[j] at the current moment. set count[j] to temp[j]
                //count[j] is frequency of common characters for previous words, and temp[j] is frequency of characters for current word
                if (temp[j] <= count[j] && temp[j] != 0) count[j] = temp[j];
                if (temp[j] == 0) count[j] = 0;
            }
        }
        // convert count to a set
        for (int i = 0; i < 26; i++) {
            while (count[i]-- > 0) {
                result.add("" + (char) ('a' + i));
            }
        }
        return result;
    }
}