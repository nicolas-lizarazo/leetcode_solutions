public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        boolean isCorrect;
        for (int i = 0; i < flowerbed.length; i++) {
            isCorrect = flowerbed[i] == 0;
            if (i != 0 && isCorrect) isCorrect = flowerbed[i - 1] == 0;
            if (i < flowerbed.length - 1 && isCorrect) isCorrect = flowerbed[i + 1] == 0;
            if (isCorrect) {
                count++;
                flowerbed[i] = 1;
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        System.out.println(solution.canPlaceFlowers(flowerbed, n)); // Output: true

        flowerbed = new int[]{1, 0, 0, 0, 1};
        n = 2;
        System.out.println(solution.canPlaceFlowers(flowerbed, n)); // Output: false
    }
}