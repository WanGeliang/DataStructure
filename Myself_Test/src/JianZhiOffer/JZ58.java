package JianZhiOffer;

import java.util.*;

public class JZ58 {

    public static void main(String[] args) {

        List<Integer> list =new ArrayList<>();
//        LinkedList
        list.add(2);
        System.out.println(list.get(1));
//        list.get(1);
//        list.set(1,4);
//        String s="  Hello World!  ";
//        System.out.println(s);
//        String res="    aa";
//        System.out.println(res);
//        while(1==2){
//        System.out.println(Arrays.toString(res.split(" ")));
//        String[] split = "2  oo oo1  ".split(" ");
//        System.out.println(split.length);
//        System.out.println(Arrays.toString(split));
//        System.out.println(method2(s));
        Map<Integer,String> map=new HashMap<>();


    }

    public static String method2(String s){
        String[] sub = s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=sub.length-1;i>=0;i--){
            if(!sub[i].contains(" ")&&i>0&&!" ".equals(sub[i])){
                sb.append(sub[i]).append(" ");
            }
            if(!sub[i].contains(" ")&&i==0){
                sb.append(sub[i]);
            }
        }
        // String res=sb.toString();

        return sb.toString();
    }
    public static String reverseWords(String s) {

        HashSet<Integer> set = new HashSet<>();
        if (s.length() == 0 || s == null) return s;
        String[] split = s.split(" ");
        System.out.println(Arrays.toString(split));
        StringBuilder sb = new StringBuilder();
        System.out.println(split[0]);
        for (int i = split.length - 1; i >= 0; i--) {
            if (split[i].length() != 0||split[i]==" "){
                if (i > 0) {
                    sb.append(split[i] + " ");
                }else {
                    sb.append(split[i]);
                }
            }

        }
        s.replace(' ',' ');
        return sb.toString().trim();
    }
}
