package LeetCode;

import java.util.Arrays;

public class leetcode_75 {
    public static void main(String[] args) {
        int[]nums={0,2,1,2,1,0,2,0,1};
        System.out.println(Arrays.toString(classColor(nums)));
    }

    //颜色分类
    public static int[] classColor(int[] nums){
        int a=0,b=0,c=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                a++;
            }else if (nums[i]==1){
                b++;
            }else {
                c++;
            }
        }
        for (int i = 0; i < a; i++) {
            nums[i]=0;
        }
        for (int i = a; i < a+b; i++) {
            nums[i]=1;
        }
        for (int i = a+b; i < nums.length; i++) {
            nums[i]=2;
        }
        return nums;
    }

    //方法2

}
