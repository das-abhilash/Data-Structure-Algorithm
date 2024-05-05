package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {

        boolean df = isValid("UuE6");
    }

    public boolean isValid(String word) {

        int charcount = 0;

        boolean vc = false;
        boolean cc = false;

        if (word.length() < 3) return false;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '@' || c == '#' || c == '$') {
                return false;
            }


            if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                continue;
            }

            charcount++;

            if (c == 'A' || c == 'a' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
                vc = true;
                continue;
            }

            cc = true;

        }

        return vc && cc;
    }

}


