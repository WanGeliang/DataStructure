package LeetCode;

import java.util.Arrays;

public class leetcode_11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 2, 1, 3, 4}));
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
//        maxArea(new int[]{1, 2, 1, 3, 4});
    }

    public static int maxArea(int[] height) {
        int k = 0;
        int[] ans = new int[height.length - 1];
        int sol = 0, res = 0;
        for (int i = 0; i < height.length - 1; i++) {
            int com = height[i];
//            int[] temp = new int[height.length - i - 1];
            for (int j = i + 1; j < height.length; j++) {
//                temp[k++] = Math.min(com, height[j]) * (j - i);
                sol = Math.max(sol, Math.min(com, height[j]) * (j - i));
            }
            k = 0;
//            Arrays.sort(temp);
//            ans[i] = temp[temp.length - 1];
            res = Math.max(res, sol);
        }
//        Arrays.sort(ans);
//        return ans[ans.length - 1];
        return res;
    }
}
