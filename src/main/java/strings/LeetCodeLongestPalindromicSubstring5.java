package strings;

/**
 * Given a string s, return the longest palindromic substring in s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 * <p>
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */


public class LeetCodeLongestPalindromicSubstring5 {
    public static void main(String[] args) {

        String str = longestPalindrome("hehlloo");
        System.out.println("Longest Palindrome: "+ str);
    }

    public static String longestPalindrome(String s) {
        int strLength = s.length();
        if(strLength <= 2) return s;

        String longestPalindrome = "";
        for(int i=0; i<strLength; i++){
            for (int j = i+1; j < strLength; j++){
                String sub= s.substring(i, j);
                if(isPalindrome(sub) && sub.length() > longestPalindrome.length()){
                    longestPalindrome = sub;
                }
            }
        }
        return longestPalindrome;

    }

    public static boolean isPalindrome(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }


}
