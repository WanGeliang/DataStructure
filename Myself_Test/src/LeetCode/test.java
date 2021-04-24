package LeetCode;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
          //默认扩容机制为10，扩展为原来的1.5倍
//        ArrayList
        String s = sc.nextLine();
        test me = new test();
        System.out.println(me.isPalin(s));


    }

    public boolean isPalin(String s){
        if(s==null) return false;
        int left=0;
        int right=s.length()-1;
        while(left<right&&s.charAt(left)==s.charAt(right)){
            left++;right--;
        }
        return left==right;
    }
}
