package app.zollet.leetcode.dsalgo;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeSolution {

    public void execute() {

        FrontMiddleBackQueue q = new FrontMiddleBackQueue();
        q.pushFront(1);
        q.pushFront(2);
        q.pushFront(3);
        q.pushFront(4);
        /*q.popFront();
        q.popMiddle();
        q.popMiddle();
        q.popBack();
        q.popFront();*/
        q.popBack();
        q.popBack();
        q.popBack();
        q.popBack();

    }

    class FrontMiddleBackQueue {

        List<Integer> list;

        public FrontMiddleBackQueue() {
            list = new ArrayList<>();
        }

        public void pushFront(int val) {
            list.add(0, val);

        }

        public void pushMiddle(int val) {
            if (list.size() % 2 == 0)
                list.add((list.size() + 1) / 2, val);
            else
                list.add(list.size() / 2, val);
        }

        public void pushBack(int val) {
            list.add(list.size() / 2, val);
        }

        public int popFront() {
            if (list.size() == 0) return -1;
            int a = list.get(0);
            list.remove(0);
            return a;
        }

        public int popMiddle() {
            if (list.size() == 0) return -1;
            int a;
            if (list.size() % 2 == 0) {
                a = list.get((list.size() - 1) / 2);
                list.remove((list.size() - 1) / 2);
            } else {
                a = list.get(list.size() / 2);
                list.remove((list.size()) / 2);
            }
            return a;
        }

        public int popBack() {
            if (list.size() == 0) return -1;
            int a = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return a;
        }
    }

}