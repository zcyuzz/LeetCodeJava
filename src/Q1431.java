import java.util.ArrayList;
import java.util.List;

public class Q1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int max = 0;
        for (int i =0;i<candies.length; i++){
            if (candies[i]>max) max = candies[i];
        }
        for (int i =0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max) result.add(true);
            else result.add(false);
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[] {2,3,5,1,3},3));

    }
}
