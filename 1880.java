import java.lang.Math;

class Solution_1880 {
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int fSum = 0, sSum = 0, tSum = 0;

        for (int i = 0; i < firstWord.length(); i++) {
            fSum += (firstWord.charAt(i) - 97) * Math.pow(10, firstWord.length() - i - 1);
        }
        for (int i = 0; i < secondWord.length(); i++) {
            sSum += (secondWord.charAt(i) - 97) * Math.pow(10, secondWord.length() - i - 1);
        }
        for (int i = 0; i < targetWord.length(); i++) {
            tSum += (targetWord.charAt(i) - 97) * Math.pow(10, targetWord.length() - i - 1);
        }
        return fSum + sSum == tSum;
    }

    public static void main(String[] args) {
        System.out.println(isSumEqual("acb", "cba", "cdb"));
        System.out.println(isSumEqual("aaa", "a", "aab"));
    }
}