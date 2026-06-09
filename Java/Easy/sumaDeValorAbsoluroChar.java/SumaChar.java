// Opcion 1

class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int num = (s.charAt(i) - '0') - (s.charAt(i + 1) - '0');
            if (num < 0) num *= -1;
            sum += num;
        }
        return sum;
    }
}

// Opcion 2

class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int num = Math.abs(s.charAt(i) - s.charAt(i + 1));
            if (num < 0) num *= -1;
            sum += num;
        }
        return sum;
    }
}