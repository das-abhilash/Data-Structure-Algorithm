package app.zollet.leetcode.dsalgo.util;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

    public static List<List<Integer>> convertArrayToList(int[][] array) {
        List<List<Integer>> listOfLists = new ArrayList<>();

        for (int[] row : array) {
            List<Integer> list = new ArrayList<>();
            for (int element : row) {
                list.add(element);
            }
            listOfLists.add(list);
        }

        return listOfLists;
    }
}
