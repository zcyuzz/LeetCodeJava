public class Q0565 {
    public int arrayNesting(int[] nums) {
        int result = 0;
        boolean[] used = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            int start = i, current = nums[start], count = 1;
            while (current != start) {
                used[current] = true;
                current = nums[current];
                count++;
            }
            if (count > result) result = count;
        }
        return result;
    }
}
