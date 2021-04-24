package ZuoShen.StringTest;

/**
 * 看两个字符串是否为变形串
 */
public class StringProblem {
    public static void main(String[] args) {

    }

    public boolean isVa(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) return false;
        int[] res = new int[256];
        char[] temp1 = s1.toCharArray();
        char[] temp2 = s2.toCharArray();
        for (int i = 0; i < temp1.length; i++) {
            res[temp1[i]]++;
        }
        for (int i = 0; i < temp2.length; i++) {
            if (temp2[i]--==0){
                return false;
            }
        }
        return true;
    }
}
