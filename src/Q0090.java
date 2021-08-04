import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q0090 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        for (int i = 0; i <= nums.length; i++) {
            dfs(0, i, nums, result, temp, used);
        }
        return result;
    }

    public void dfs(int begin, int length, int[] nums, List<List<Integer>> result, List<Integer> temp, boolean[] used) {
        if (temp.size() == length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = begin; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            if (nums.length - i < length - temp.size()) break;
            temp.add(nums[i]);
            used[i] = true;
            dfs(i + 1, length, nums, result, temp, used);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}
