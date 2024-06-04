package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {
        int a = longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth");
    }

    public int longestPalindrome(String s) {

        int[] lower = new int[26];
        int[] upper = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                upper[c - 'A']++;
            } else {
                lower[c - 'a']++;
            }
        }

        int ans = 0;
        boolean odd = false;
        for (int i = 0; i < 26; i++) {
            if (lower[i] % 2 == 0) {
                ans = ans + lower[i];
            } else {
                odd = true;
                ans = ans + lower[i] - 1;
            }

        }
        for (int i = 0; i < 26; i++) {
            if (upper[i] % 2 == 0) {
                ans = ans + upper[i];
            } else {
                odd = true;
                ans = ans + upper[i] - 1;
            }

        }
        return ans + (odd ? 1 : 0);

    }


}


