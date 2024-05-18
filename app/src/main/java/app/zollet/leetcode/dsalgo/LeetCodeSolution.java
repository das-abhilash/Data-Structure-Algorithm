package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {

        int sdf = compareVersion("1.2", "1.10");

    }

    public int compareVersion(String version1, String version2) {

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int index = 0;
        for (; index < Math.min(v1.length, v2.length); index++) {

            int compare = Integer.compare(Integer.valueOf(v1[index]), Integer.valueOf(v2[index]));

            if (compare == 0) continue;
            return compare;
        }

        for (; index < v1.length; index++) {
            if (Integer.valueOf(v1[index]) == 0) continue;
            return 1;
        }

        for (; index < v2.length; index++) {
            if (Integer.valueOf(v2[index]) == 0) continue;
            return -1;
        }

        return 0;

    }

}


