package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCodeSolution {


    public void execute() {
        List<Integer> q = new ArrayList<>();
        q.add(1);
        List<Integer> q1 = new ArrayList<>();
        q1.add(2);
        List<Integer> q2 = new ArrayList<>();
        q2.add(3);
        List<Integer> q4 = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        list.add(q);
        list.add(q1);
        list.add(q2);
        list.add(q4);
        boolean s = canVisitAllRooms(list);
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        Set<Integer> visited = new HashSet<>();

        solve(rooms, visited, 0);

        return visited.size() == rooms.size();
    }

    private void solve(List<List<Integer>> rooms, Set<Integer> visited, int room) {
        if (visited.contains(room)) return;

        visited.add(room);

        for (int r : rooms.get(room)) {
            if (!visited.contains(r)) {
                solve(rooms, visited, r);
            }
        }
    }
}