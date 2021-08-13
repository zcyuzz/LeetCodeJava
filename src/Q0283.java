public class Q0283 {
    public void moveZeroes(int[] nums) {
        //Time: O(n)
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[index++] = nums[i];
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
        //Time: O(n^2)
//        for(int i =0;i<nums.length;i++){
//            if(nums[i]!=0){
//                for(int j=0;j<i;j++){
//                    if(nums[j]==0){
//                        nums[j]=nums[i];
//                        nums[i]=0;
//                        break;
//                    }
//                }
//            }
//        }
    }
}
