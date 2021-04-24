package XiaoMi;

import java.util.*;

public class test20200402 {
    static List<List<Integer>> res = new ArrayList();
    static List<Integer> sub = new ArrayList();
//String
    public static void main(String[] args) {
//        test20200402 me = new test20200402();
//        int[] nums = {1, 2, 3};
//        me.subsets(nums);
//        for (int i = 0; i < res.size(); i++) {
//            for (int j = 0; j < sub.size(); j++) {
//                System.out.println(res.get(i).get(j));
//            }
//        }
//        Map<Object, Object> map = new HashMap<>();
//        int[][] temp={{3,2},{1,3},{2,4}};
//        for (int i = 0; i < temp.length; i++) {
//            for (int j = 0; j < temp[0].length; j++) {
//                System.out.println(temp[i][j]);
//            }
//        }
//        Arrays.sort(temp,);
//        Stack
//        TreeMap
        Set<Integer> set =new HashSet<>();

        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,2);
        map.put(2,4);
        for(int key:map.keySet()){
            System.out.println(key);
        }
        LinkedList<List<Integer>> res=new LinkedList();

//        for (int i = 0; i < temp.length; i++) {
//            for (int j = 0; j < temp[0].length; j++) {
//                System.out.println(temp[i][j]);
//            }
//        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null || nums.length == 0) return res;

        for (int i = 0; i <= nums.length; i++) {
            dfs(nums, i, 0);
        }
        return res;
    }

    public void dfs(int[] nums, int n, int start) {
        if (sub.size() == n) {

            res.add(new ArrayList(sub));

            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (sub.contains(nums[i])) continue;
            sub.add(nums[i]);
            dfs(nums, n, start + 1);
            sub.remove(sub.size() - 1);
        }
        return;
    }
}
