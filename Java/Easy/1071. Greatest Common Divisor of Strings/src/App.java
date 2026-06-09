public class App {
    // mi solucion
    public static String gcdOfStrings(String str1, String str2) {
        String sum1 = str1 + str2;
        String sum2 = str2 + str1;
        if (!sum1.equals(sum2)) return "";
        int str1Size = str1.length();
        int str2Size = str2.length();
        int max = (str1Size >= str2Size) ? str1Size: str2Size;
        int min = (str1Size <= str2Size) ? str1Size: str2Size;
        int strSize = calculateMCD(max, min);
        return str1.substring(0, strSize);
    }

    private static int calculateMCD(int a, int b) {
        if (b == 0) return a;
        return calculateMCD(b, a % b);
    } 

    public static void main(String[] args) throws Exception {
        System.out.println(App.gcdOfStrings("ABCABC", "ABC"));
    }
}
