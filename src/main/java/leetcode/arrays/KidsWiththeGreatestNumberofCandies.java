package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        List<Boolean> bools = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            bools.add(i, candies[i] + extraCandies >= max);
        }
        return bools;
    }
}
