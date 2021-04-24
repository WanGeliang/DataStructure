package LeetCode;
/**
 * �����������������е��������� nums1 �� nums2, �Լ�һ������ k��
 *
 * ����һ��ֵ?(u,v)�����е�һ��Ԫ������?nums1���ڶ���Ԫ������ nums2��
 *
 * �ҵ�����С�� k ������?(u1,v1), (u2,v2) ... (uk,vk)��
 *
 * ʾ�� 1:
 *
 * ����: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
 * ���: [1,2],[1,4],[1,6]
 * ����: ���������е�ǰ 3 ������
 *      [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
 *
 */

import java.util.ArrayList;
import java.util.List;

public class leetcode_373 {
    public static void main(String[] args) {
//        int[] nums1={1,7,11};
        int[] nums1={1,1,2};
//        int[] nums2={2,4,6};
        int[] nums2={1,2,3};
        List<List<Integer>> smallestPairs = kSmallestPairs(nums1, nums2, 2);
        for (int i = 0; i < smallestPairs.size(); i++) {
            List<Integer> integers = smallestPairs.get(i);
            for (int j = 0; j < integers.size(); j++) {
                System.out.print(integers.get(j)+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> resList=new ArrayList<>();
        if ((nums1==null||nums1.length==0)||(nums2==null||nums2.length==0)){
            return null;
        }
        if (k>nums1.length||k>nums2.length){
            return null;
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                List<Integer> subList= new ArrayList<>();
                subList.add(nums1[i]);
                subList.add(nums2[j]);
                resList.add(subList);
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(resList.get(i));
        }
        //���������˫��forѭ��
        return ans;
    }
}
