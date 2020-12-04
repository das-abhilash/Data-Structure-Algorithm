package app.zollet.leetcode.dsalgo;

import java.util.ArrayList;
import java.util.List;

import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {

    public void execute() {
    }

    public int kthFactor(int n, int k) {
        int c=0;
        for(int i = 1;i<= n;i++ ){
            if(n%i == 0)
                c++;
            if(c == k) return i;
        }
        return -1;
    }

}