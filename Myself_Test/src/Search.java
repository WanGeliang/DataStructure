import java.util.ServiceConfigurationError;

public class Search {
    public static void main(String[] args) {
//        int[] nums = {1, 1, 2, 3, 4, 4, 4, 5, 5};
//        Search me = new Search();
//        System.out.println("最左边的数" + me.getLeft(nums, 5));
//        System.out.println("最右边的    数" + me.getRight(nums, 5));
        System.out.println('1'+'0');
        System.out.println(Integer.valueOf('1'));
        String a="1010";
        System.out.println(a.charAt(0) - '1');

    }


    //寻找最左边的数
    public int getLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                right = mid - 1;
            }
        }
        if (right >= -1 && nums[right + 1] == target) return right + 1;
        return -1;
    }

    //寻找最右边的数
    public int getRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (left <= nums.length && nums[left - 1] == target) return left - 1;
        return -1;
    }

}
