package SumProblem;

import java.util.*;

public class Sum_3 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        int[] sum = {};
        int target = 0;
        List<Integer> list=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        Object[] objects = list.toArray();
        list.toArray(new int[][]{new int[]{}});
//        int[] res = list.toArray();
        list.toArray();
//        for (int res : sum) {
//            System.out.println(res);
//        }
    }

    public static List<Integer> get3Sum(int[] nums, int start, int target) {
        int lo = start;
        int hi = nums.length - 1;
        List<Integer> list=new ArrayList<>();
        while (lo < hi) {
            int sum = nums[lo] + nums[hi];
            if (lo < hi && sum < target) {
                lo++;
            } else if (lo < hi && sum > target) {
                hi--;
            } else if (lo < hi && sum == target) {
                list.add(nums[lo]);
                list.add(nums[hi]);
                return list;
            }
        }
        return list;
    }
}
