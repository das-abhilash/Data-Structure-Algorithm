package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {
        boolean a = search(new int[]{2, 5, 6, 0, 0, 1, 2}, 5);
    }


    public boolean search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {

            int mid = l + (r - l) / 2;
            if (nums[mid] == target) return true;
            if (nums[l] == target) return true;
            if (nums[r] == target) return true;

            if (nums[mid] == nums[r]) {
                l++;
                continue;
            }

            if (nums[mid] > nums[r]) {
                if (target < nums[mid] && target > nums[l]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target > nums[mid] && target < nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return false;
    }

    /*public boolean search(int[] nums, int target) {
        if (nums.length == 0) return false;
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {

            int mid = l + (r - l) / 2;

            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else if (nums[mid] < nums[r]) {
                r = mid;
            } else {
//                l++;
                r--;
            }
        }

        if (target == nums[nums.length - 1]) return true;
        if (target > nums[nums.length - 1]) {
            r = l - 1;
            l = 0;
        } else {
            r = nums.length - 1;
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) return true;

            if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return false;
    }
*/
}