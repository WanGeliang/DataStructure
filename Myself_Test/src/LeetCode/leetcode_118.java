package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_118 {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    //�������

    public static List<List<Integer>> generate(int number){
        List<List<Integer>> resList=new ArrayList<>();
        int[][] array=new int[number][number];
        System.out.println(array.length);
        System.out.println(array[0].length);
        for (int i = 0; i < number; i++) {
            List<Integer> subList = new ArrayList<>();//ÿһ�ν�����new����һ���µ�list��Ȼ���ٷŽ����յ�List��
            for (int j = 0; j <=i ; j++) {
                if (j==0||j==i){
                    array[i][j]=1;
                }else {
                    array[i][j]=array[i-1][j-1]+array[i-1][j];
                }
                subList.add(array[i][j]);
            }
            resList.add(subList);
        }
        return resList;
    }
}
