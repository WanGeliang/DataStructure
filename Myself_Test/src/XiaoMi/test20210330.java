package XiaoMi;

import java.util.*;

/**
 * @author Dell
 */
public class test20210330 {
    List<List<String>> res=new ArrayList<>();
    List<String> temp=new ArrayList<>();
    public static void main(String[] args) {
        //����4λ���� �������һ����0�㣨00��00������ʱ��ֵ
        //00:00����24:00
        //23:59
//        Date
//        Scanner sc = new Scanner(System.in);
//        String intput = sc.nextLine();
//        String[] nums = intput.split(",");
        int[] array = {2, 1, 4, 3};
        Arrays.sort(array);
//        for (String s : nums) {
//            System.out.println(s);
//        }\
        for (int i : array) {
            System.out.println(i);
        }
        //����

        String s1 = "2400";
        String s2 = "2359";
        StringBuilder sb=new StringBuilder(s2);
        sb.reverse();
        System.out.println(sb.toString());
        System.out.println(Integer.valueOf(s1) - Integer.valueOf(s2));
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
//            int temp=
            for (int j = 0; j < array.length && array[i] != array[j]; j++) {

            }
        }
    }

    public void dfs(int[] nums,int i) {
        if(temp.size()==4){
            res.add(temp);
            return;
        }
        temp.add(String.valueOf(nums[i]));

    }
}
