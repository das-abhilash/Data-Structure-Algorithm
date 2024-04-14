package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {
        String df = findLatestTime("1?:?4");
    }

    public String findLatestTime(String s) {
        return fixHour(s.charAt(0), s.charAt(1)) + ":" + fixMin(s.charAt(3), s.charAt(4));
    }

    public String fixHour(char i, char j) {

        if (i == '?' && j == '?') {
            return "11";
        } else if (i == '?') {
            if ( j == 49 || j == 48) {
                return "1" + j;
            } else {
                return "0" + j;
            }
        } else if (j == '?') {
            if ( i == 49 ) {
                return "11";
            } else {
                return "09";
            }
        }
        return String.valueOf(i) + j;
    }

    public String fixMin(char i, char j) {
        if (i == '?' && j == '?') {
            return "59";
        } else if (i == '?') {
            return "5" + j;
        } else if (j == '?') {
            return i + "9";
        }
        return String.valueOf(i) + j;
    }

}