package JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JZ17_BigInteger {
    public static void main(String[] args) {
        JZ17_BigInteger m = new JZ17_BigInteger();
        System.out.println(Arrays.toString(m.printNumbers(2)));
//        StringBuffer
    }

//    int[] res;
//    int nine = 0, count = 0, start, n;
//    char[] num, loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//
//    public int[] printNumbers(int n) {
//        this.n = n;
//        res = new int[(int) Math.pow(10, n) - 1];
//        num = new char[n];
//        start = n - 1;
//        dfs(0);
//        return res;
//    }
//
//    public void dfs(int x) {
//        if (x == n) {
//            String s = String.valueOf(num).substring(start);
//            if (!s.equals("0")) res[count++] = Integer.parseInt(s);
//            if (n - start == nine) start--;
//            return;
//        }
//        for (char i : loop) {
//            if (i == '9') nine++;
//            num[x] = i;
//            dfs(x + 1);
//        }
//        nine--;
//    }
//}ng.valueOf(num).substring(start);
////            if (!s.equals("0")) res[count++] = Integer.parseInt(s);
////            if (n - start == nine) start--;
////            return;
////        }
////        for (char i : loop) {
////            if (i == '9') nine++;
////            num[x] = i;
////            dfs(x + 1);
////        }
////        nine--;
////    }
////}


    // ���ڴ洢�����������ַ���
    public List<Integer> list;

    public int[] printNumbers(int n) {
        // �洢����������'��'  '��'���������ַ���
        list = new ArrayList<>();
        dfs(n, 0, new StringBuilder());
        int[] res = new int[list.size()];
        // ��������
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private void dfs(int n, int index, StringBuilder sb) {
        // �ݹ����������
        if (index == n) {//n=2,index=0;
            while (sb.length() != 0 && sb.charAt(0) == '0') {
                // ����߶����0ɾ��
                sb.deleteCharAt(0);
            }
            // ���ַ�����ʽ��'��'��ת��Ϊ����
            if (sb.length() != 0) {
                list.add(Integer.valueOf(sb.toString()));
            }
            return;
        }
        for (int j = 0; j < 10; j++) {
            // ���������һλ
            sb.append(j);
            dfs(n, index + 1, sb);
            if (sb.length() != 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
