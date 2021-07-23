import java.util.Arrays;

public class Q1052 {
    public int heightChecker(int[] heights) {
        int result = 0;
        int [] temp = heights.clone();
        Arrays.sort(temp);
        for(int i =0;i<heights.length;i++){
            if(heights[i]!=temp[i])result++;
        }
        return result;
    }
}
