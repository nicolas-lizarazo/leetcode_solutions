public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Solution.mergeAlternately("ncls","ioa"));
        System.out.println(Solution2.mergeAlternately("hlm","oaundo"));     
    }

    // Mi solucion 

    static class Solution {
        public static String mergeAlternately(String word1, String word2) {
            int max = Math.max(word1.length(), word2.length());
            StringBuilder newWord = new StringBuilder();
            for(int index = 0; index < max; index++) {
                if (word1.length() > index) newWord.append(word1.charAt(index));
                if (word2.length() > index) newWord.append(word2.charAt(index));
            }
            return newWord.toString();
        }
    }

    // Solucion mas eficiente
    static class Solution2 {
        public static String mergeAlternately(String word1, String word2) {
            int len1 = word1.length();
            int len2 = word2.length();
            int min = Math.min(len1, len2);
            String longerString = "";
            if(min == len1){
                longerString = word2;
            }
            if(min == len2){
                longerString = word1;
            }
            char chars1[] = word1.toCharArray();
            char chars2[] = word2.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < min; i++){
                sb.append(chars1[i]);
                sb.append(chars2[i]);
            }
            sb.append(longerString.substring(min));
            return sb.toString();
        }
    }
}
