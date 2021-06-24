import java.util.Arrays;

public class Q1672 {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int temp =0;
        for(int i =0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                temp += accounts[i][j];
            }
            if(temp>max) max = temp;
            temp = 0;
        }
    return max;
    }

    public static void main(String[] args) {
        int [][] testcase = new int[2][];
        testcase[0]= new int[]{1,2,3};
        testcase[1] = new int[] {3,2,1} ;

        System.out.println(maximumWealth(testcase));
    }
}
