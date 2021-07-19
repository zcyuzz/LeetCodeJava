import java.util.Arrays;

public class Q506uf {
    public String[] findRelativeRanks(int[] score) {
        String [] result = new String[score.length];
        Arrays.sort(score);
        for(int i = score.length-1;i>=0;i--){
            if(i==0) result[i]="Gold Medal";
            if(i==1) result[i]="Silver Medal";
            if(i==2) result[i]="Bronze Medal";
            else{

            }
        }
        return new String []{};
    }
}
