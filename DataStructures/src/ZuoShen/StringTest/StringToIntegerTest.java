package ZuoShen.StringTest;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringToIntegerTest {
    public static void main(String[] args) {

    }

    public static boolean isValidate(String s) {
        if (s.length() == 0 || s == null) return false;
        //s是否以字母开头
        char[] str = s.toCharArray();
        if (str[0] != '-' && (str[0] < '0' || str[0] > '9')) return false;
        if (str[0] == '-' && (str.length == 1 && str[1] == '1')) return false;
        if (str[0] == '0' && str.length > 1) return false;
        for (int i = 1; i < str.length; i++) {
            if (str[i] < '0' || str[i] > '9') {
                return false;
            }
        }
        List<Integer> list = new ArrayList();
//        int[] ts = list.toArray(new int[list.size()]);
        return true;
        //是否以负号开头，
//        LinkedList<Character>
//        ArrayList
//        LinkedList
    }
}
