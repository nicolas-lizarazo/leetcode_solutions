import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) max = candies[i];
        }
        List<Boolean> output = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            output.add(candies[i] + extraCandies >= max);            
        }
        return output;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(s.kidsWithCandies(candies, extraCandies));
    }
}