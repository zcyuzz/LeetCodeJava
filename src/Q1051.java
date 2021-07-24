public class Q1051 {
    public int heightChecker(int[] heights) {
        //sort array first
//        int result = 0;
//        int [] temp = heights.clone();
//        Arrays.sort(temp);
//        for(int i =0;i<heights.length;i++){
//            if(heights[i]!=temp[i])result++;
//        }
//        return result;
        //Counting sort
        int result =0;
        int [] temp = new int [ 101];
        for(int i =0;i<heights.length;i++){
            temp[heights[i]]++;
        }
        int index =0;
        for(int i =0;i<101;i++){

        }
        return result;

    }
}
