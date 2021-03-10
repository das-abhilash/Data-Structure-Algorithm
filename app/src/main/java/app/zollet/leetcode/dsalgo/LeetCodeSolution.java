package app.zollet.leetcode.dsalgo;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {

    public void execute() {
        String s = intToRoman(58);
    }

    public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();

        while (num >= 1000) {
            s.append("M");
            num = num - 1000;
        }

        while (num >= 900) {
            s.append("CM");
            num = num - 900;
        }

        while (num >= 500) {
            s.append("D");
            num = num - 500;
        }

        while (num >= 400) {
            s.append("CD");
            num = num - 400;
        }

        while (num >= 100) {
            s.append("C");
            num = num - 100;
        }

        while (num >= 90) {
            s.append("XC");
            num = num - 90;
        }

        while (num >= 50) {
            s.append("L");
            num = num - 50;
        }

        while (num >= 40) {
            s.append("XL");
            num = num - 40;
        }

        while (num >= 10) {
            s.append("X");
            num = num - 10;
        }

        while (num >= 9) {
            s.append("IX");
            num = num - 9;
        }

        while (num >= 5) {
            s.append("V");
            num = num - 5;
        }

        while (num >= 4) {
            s.append("IV");
            num = num - 4;
        }

        while (num >= 1) {
            s.append("I");
            num = num - 1;
        }


        return s.toString();
    }

}