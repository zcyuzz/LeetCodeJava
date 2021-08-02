import java.util.HashSet;

public class Q0003uf {
    public int lengthOfLongestSubstring(String s) {
        int temp = 0;
        int result =0;
        HashSet<Character> characters= new HashSet<>();
        for(int i =0;i<s.length();i++){
            if(!characters.contains(s.charAt(i))){
                characters.add(s.charAt(i));
                temp++;
            }
            else{
                characters.removeAll(characters);
                characters.add(s.charAt(i));
                temp=1;
            }

            if(result<temp) result = temp;
            System.out.println(result);
        }
        return result;
    }
}
