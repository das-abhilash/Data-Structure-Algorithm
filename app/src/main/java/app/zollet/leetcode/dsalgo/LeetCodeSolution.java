package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {


    public void execute() {


        boolean h = validPalindrome("aba");
        h = validPalindrome("abad");
        h = validPalindrome("abcd");
    }

    public boolean validPalindrome(String s) {
        if (isPalindrome(s)) return true;

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {

            char c = sb.charAt(i);
            sb.deleteCharAt(i);

            if (isPalindrome(sb.toString())) {
                return true;
            }
            sb.insert(i, c);
        }
        return false;
    }

    private boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}