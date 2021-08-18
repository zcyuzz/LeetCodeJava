public class Q1217 {
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) even++;
            else odd++;
        }
        return even > odd ? odd : even;
    }
}
