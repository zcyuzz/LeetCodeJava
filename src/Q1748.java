

public class Q1748 {
    public int sumOfUnique(int[] nums) {
        int result = 0;
        int[] temp = new int[101];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]]++;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 1) result += i;
        }
        return result;
        //hash map
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int result = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int num = nums[i];
//            if (map.containsKey(num)) map.put(nums[i], 2);
//            else map.put(nums[i], 1);
//        }
//        for (int i : map.keySet()) {
//            if (map.get(i) == 1) result += i;
//        }
//        return result;
    }
}
