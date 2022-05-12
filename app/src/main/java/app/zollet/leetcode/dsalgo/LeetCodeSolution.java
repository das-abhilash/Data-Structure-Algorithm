package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {


    public void execute() {


        boolean h = validPalindrome("abc");
        int f = 0;
        h = validPalindrome("abad");
        f = 0;
        h = validPalindrome("abca");
        f = 0;
    }

    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length();

        while (start < end) {
            if (isPalindrome(s, start, end)) return true;
            if (s.charAt(start) != s.charAt(end - 1)) {
                return (isPalindrome(s, start, end - 1) || isPalindrome(s, start + 1, end));
            }
            start++;
            end--;
        }
        return false;
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}