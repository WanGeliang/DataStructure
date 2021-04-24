package JianZhiOffer;

import java.util.HashMap;
import java.util.Map;

//第一个只出现一次的字符
public class JZ50 {
    public static void main(String[] args) {
        char result = JZ50.getChar("leetcode");
        System.out.println(result);
    }

    public static char getChar(String s){
        if("".equals(s)) return ' ';
        if(s.length()==1) return s.charAt(0);
        Map<Character,Integer> map=new HashMap<>();
        int i=0,n=s.length();
        while(i<n){
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
            i++;
        }
        int j=0;
        while(j<n){
            if(map.get(s.charAt(j))==1)
                return s.charAt(j);
            i++;
        }

        return ' ';

    }
}
