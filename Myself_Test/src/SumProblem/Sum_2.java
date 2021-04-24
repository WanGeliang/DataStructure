package SumProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sum_2 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 2, 2, 3};
        int[][] sum = get2Sum(nums, 4);
        for (int[] res : sum) {
            System.out.println(Arrays.toString(res));
        }

    }

    public static int[][] get2Sum(int[] nums, int target) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(nums);
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {

            int sum = nums[lo] + nums[hi];
            int left = nums[lo];
            int right = nums[hi];
            if (lo < hi && sum < target) {
                while (lo < hi && nums[lo] == left) lo++;
            } else if (lo < hi && sum > target) {
                while (lo < hi && nums[hi] == right) hi--;
            } else if (lo < hi && sum == target) {
                int[] temp=new int[]{left,right};
                list.add(temp);
            }
            while (lo < hi && nums[lo] == left) lo++;
            while (lo < hi && nums[hi] == right) hi--;

        }


        return list.toArray(new int[list.size()][]);
    }
}
