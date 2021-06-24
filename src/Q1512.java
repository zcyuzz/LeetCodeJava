public class Q1512 {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        int [] temp = new int[101];
        for(int i = 0; i <nums.length;i++){
            temp[nums[i]]++;
        }
        for(int i =0; i<temp.length;i++){
            count+=(temp[i]-1)*temp[i]/2;
        }
        return count;
    }

    public static void main(String[] args) {
        int [] testcase = new int[]{5,5,1,77,96,96,89,80,12,23,1,6,3,66,39,88,48,38,44,32,44,36,60,87,53,77,72,49,13,39,60,60,71,68,80,75,79,38,4,14,59,75,6,91,87,95,25,55,83,18,26,59,53,100,42,96,76,22,21,4,22,46,34,39,98,82,54,73,52,33,47,73,54,23,82,98,13,51,52,1,96,69,76};
        System.out.println(numIdenticalPairs(testcase));
        System.out.println(testcase.length);
    }
}
