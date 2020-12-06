package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
    }

    public String interpret(String command) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G')
                s.append(command.charAt(i));
            else {
                if (command.charAt(i + 1) == ')') {
                    s.append('o');
                    i++;
                } else {
                    s.append("al");
                    i += 3;
                }
            }
        }
        return s.toString();
    }

}