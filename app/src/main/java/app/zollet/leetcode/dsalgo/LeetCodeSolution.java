package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {

    }

    public int lengthOfLastWord(String s) {
        String input = s.trim();
        int answer = 0;
        for (int i = input.length() -1; i >=0; i--) {
            if(input.charAt(i)  == ' ') {
                break;
            } else {
                answer++;
            }
        }
        return answer;
    }

}