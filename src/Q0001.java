import java.util.HashMap;

public class Q0001 {
    public int[] twoSum(int[] nums, int target) {
        //hashmap
        int[] result =new int[2];
        HashMap<Integer,Integer> numbers = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            numbers.put(nums[i],i);
        }
        for(int i =0;i<nums.length;i++){
            int temp = target - nums[i];
            if(numbers.containsKey(temp)&&numbers.get(temp)!=i){
                result[0]=i;
                result[1]=numbers.get(temp);
                return result;
            }
        }
        return result;
        //brute force
//        int[] answer =new int[2];
//        for(int i =0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]+nums[j]==target){
//                    answer[0] =i;
//                    answer[1] =j;
//                }
//            }
//        }
//
//        return answer;
    }

}
