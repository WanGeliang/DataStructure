package ExamTest;

public class bishi1029 {
    public static void main(String[] args) {

        String turn = turn(-3);
        System.out.println(turn);
    }

    public static String turn(int number) {
        StringBuffer sb = new StringBuffer();
        if (number > 0) {
            while (number != 0) {
                if (number > 0) {
                    sb.append(number % 2);
                    number = number / 2;
                }
            }
        } else if (number < 0) {
            for (int i = 0; i < 32; i++) {
                // 0x80000000 ��һ����λΪ1������λ��Ϊ0������
                int t = (number & 0x80000000 >>> i) >>> (31 - i);
                sb.append(t);
            }
        }
        return sb.toString();
    }


}

