package LeetCode;
//’“≤ªÕ¨
public class leetcode_381 {
    public static void main(String[] args) {
        String s="ae";
        String t="aea";
//        s.contains()
        System.out.println(findTheDifference(s, t));
    }
    public static char findTheDifference(String s, String t) {
        char s1=0,s2=0;
//        for (int i = 0; i < s.length(); i++) {
//            s1+=s.charAt(i);
//        }
//        for (int i = 0; i < t.length(); i++) {
//            s2+=t.charAt(i);
//        }
//        return (char) (s2-s1);
        int i=0,j=0;
        while (j<s.length()&&i<t.length()){
            s1= (char) ((t.charAt(i)-s.charAt(j))+s1);
            i++;j++;
        }
        return s1;
    }
}

