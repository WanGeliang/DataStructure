package LeetCode;

public class leetcode_58 {
    public static void main(String[] args) {
        String s="aaaa ";
        System.out.println(LastWordsLength(s));
//        LastWordsLength(s);
    }
    public static int LastWordsLength(String s){
        if (s==null||s.length()==0||(s.length()==1&&s.charAt(0)==' ')){
            return  0;
        }
        int len=0;
        int i=s.length()-1;
        int count=0;
        while (i>0){
            if (s.charAt(i)==' '){
                i--;
            }else {
                count++;
                if (s.charAt(i-1)==' '){
                    return count;
                }
                i--;
            }
        }
        if (s.charAt(0)!=' '){
            count++;
        }
        return count;
    }

    //方法2
    public static int getLengthMax(String s){
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length != 0) {//length不等于0直接renturn掉
                return length;
            }
        }
        return length;

    }
}
