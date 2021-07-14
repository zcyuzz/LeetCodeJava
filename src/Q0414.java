public class Q0414 {
    public static int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==first||nums[i]==second||nums[i]==third)continue;
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
                continue;
            }
            if (nums[i] > second) {
                third = second;
                second = nums[i];
                continue;
            }
            if (nums[i] > third) {
                third = nums[i];
            }
        }
            if(third == Integer.MIN_VALUE){
                int count=1;
                int temp=nums[0];
                for(int i =1;i<nums.length;i++){
                    if(nums[i]!=nums[0]&&nums[i]!=temp){
                        count++;
                        if(count==3)return third;
                        temp=nums[i];
                    }
                }
                if(count<3) return first;
            }
        return third;
    }

    public static void main(String[] args) {
        int [] temp = new int[]{1,2};
        System.out.println(thirdMax(temp));

    }
}
