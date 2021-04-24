package JianZhiOffer;

public class TwoTreeSouSuo {
    public static void main(String[] args) {
        int[] nums={4,8,6,12,16,14,10};
        TwoTreeSouSuo me = new TwoTreeSouSuo();
        me.VerifySquenceOfBST(nums);
    }


    public boolean VerifySquenceOfBST(int[] nums) {
        if (nums == null || nums.length <= 1) return true;
        return helper(nums, 0, nums.length - 1);
    }

    public boolean helper(int[] nums, int left, int right) {
//         if(left > right)return true;
        int temp = nums[right];
        int k = left;
        while (k <= right && nums[k] < temp) k++;
        if (k == left) return false;
        if (k == right) return true;
        return helper(nums, left, k - 1) && helper(nums, k, right - 1);
    }

}
