package Hot100;

public class num560 {
    public static void main(String[] args) {
        int[] nums={1,1,2,1,1,1};
        System.out.println(subarraySum(nums,3));
    }

    public static int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < len; i++) {

            if (nums[i] < k) {
                sum = nums[i];
                for (int j = i + 1; j < len; j++) {
                    sum+=nums[j];
                    if (sum==k){
                        count++;
                    }else if (sum>k){
                        break;
                    }else {
                        continue;
                    }
                }
            } else if (nums[i] == k) {
                count++;
            } else {
                continue;
            }
        }
        return count;
    }
}
