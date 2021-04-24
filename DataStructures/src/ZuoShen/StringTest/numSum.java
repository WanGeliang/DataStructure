package ZuoShen.StringTest;

public class numSum {
    public static void main(String[] args) {
        String s = "1AAA--4-4";
        numSum me = new numSum();
        System.out.println(me.numSumTest(s));
    }

    /**
     * 主要是将一个字符串中的数字进行相加，其中有'-'号与
     * @param s
     * @return
     */
    public int numSumTest(String s) {

        if (s == null) return 0;
        char[] tempArray = s.toCharArray();
        int res = 0;
        int num = 0;
        int cur = 0;
        boolean flag = true;
        for (int i = 0; i < tempArray.length; i++) {
            cur = tempArray[i] - '0';
            if (cur < 0 || cur > 9) {
                res += num;
                num = 0;
                if (i - 1 > -1 && tempArray[i - 1] == '-') {
                    flag = !flag;
                } else {
                    flag = false;//其他非-号元素的字符
                }
            } else {
                num = num * 10 + (flag ? cur : -cur);
            }
        }
        res += num;
        return res;
    }
}
