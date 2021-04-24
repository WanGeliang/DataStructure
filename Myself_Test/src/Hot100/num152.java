package Hot100;

import java.util.Arrays;

public class num152 {
    public static void main(String[] args) {
    int[] nums={2,3,-2,-4};
        System.out.println(maxProduct(nums));
    }

    /**
     *乘积最大子数组
     * @param nums
     * @return
     */
    public static int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int imax=1;
        int imin=1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0) {int temp=imax;imax=imin;imin=imax;}
            imax=Math.max(nums[i]*imax,nums[i]);
            imin=Math.min(nums[i]*imin,nums[i]);
            max=Math.max(max,imax);
        }
        return max;
    }

    /**
     * 对于以 ii 项为末尾项的子数组能产生的最小积，它有 3 种情况：
     * 不和别人乘，就它自己
     * 自己是负数，希望乘上前面的最大积
     * 自己是正数，希望乘上前面的最小积
     * 所以，dp[i][0]dp[i][0] 取三种情况中的最小值
     * dp[i][0] = min( dp[i - 1][0] * nums[i],dp[i - 1][1] * nums[i], nums[i])
     * dp[i][0]=min(dp[i?1][0]?nums[i],dp[i?1][1]?nums[i],nums[i])
     *
     * 类似的，dp[i][1]dp[i][1] 值取三种情况中的最大值
     * dp[i][1] = max( dp[i - 1][0] * nums[i], dp[i - 1][1] * nums[i], nums[i])
     * dp[i][1]=max(dp[i?1][0]?nums[i],dp[i?1][1]?nums[i],nums[i])
     *
     *
     * @param nums
     * @return
     */
    public static int maxMethod(int[] nums) {
        if (nums.length==0) return 0;
        int preMin=nums[0];
        int preMax=nums[0];
        int res=nums[0];
        for (int i = 1; i < nums.length; i++) {
            preMax=Math.max(Math.max(nums[i]*preMax,nums[i]*preMin),nums[i]);
            preMin=Math.min(Math.min(nums[i]*preMax,nums[i]*preMin),nums[i]);
            res=Math.max(res,preMax);
        }
        return res;
    }

}
