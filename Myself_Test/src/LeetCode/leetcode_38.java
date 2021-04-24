package LeetCode;

import java.text.CollationElementIterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class leetcode_38 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int[] temp = {3, 5, 1};
        leetcode_38 meth = new leetcode_38();
//        System.out.println(meth.search(temp, 3));
        meth.search(temp, 3);
//        double a= Double.parseDouble(null);
        int[] ints = new int[]{};
        HashMap<Integer, Integer> map = new HashMap<>();
//        map(new Comparable<>()
//        Collections.sort(map, new Comparator<Map<Integer,Integer>>() {
//            @Override
//            public int compare(Map<Integer, Integer> o1, Map<Integer, Integer> o2) {
//                return o1.get(0)-o2.get(0);
//            }
//        });
    }

    public int search(int[] nums, int target) {
        if (nums.length == 0 || nums == null) return -1;
        if (nums.length == 1 && target != nums[0]) return -1;
        if (nums.length == 1 && target == nums[0]) return 0;
        int count = -1;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            if (j == nums.length) break;
            if (!(nums[j] > nums[i])) {
                count = i;
                break;
            }
        }
        if (count == -1) {
            return HelpSearch(nums, 0, nums.length - 1, target);
        }
        if (nums[count] == target) {
            return count;
        } else if (nums[count] < target) {
            return -1;
        } else {
            int m = HelpSearch(nums, count + 1, nums.length - 1, target);
            int n = HelpSearch(nums, 0, count - 1, target);
            if (m != -1) {
                return m;
            }
            if (n != -1) return n;
            return -1;
        }

    }

    public int HelpSearch(int[] nums, int l, int r, int target) {
        int left = l;
        int right = r;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
