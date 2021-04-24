package JianZhiOffer;

//只出现一次的数字，其余数字数学三次
public class JZ_56 {
    public static void main(String[] args) {
        int[] res=new int[]{2,1,2,2,3,3,3};
        System.out.println(singleNumber(res));
    }

    //
    public static int singleNumber(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int[] bitSumArray = new int[32];    // 用于记录 数组中所有数字 的 每一位的和
        for (int num : nums) {
            /*
                由高到低，遍历当前数字的每一位，
                若 当前位为1，则使bitSumArray数组的相应的单元的值+1
            */
            int curBit = 1;
            for (int i = 31; i >= 0; i--) {
                if ((curBit & num) != 0) {
                    bitSumArray[i]++;
                }
                curBit <<= 1;
            }
        }
        String s=new String();
        String[] split = s.split("");
        int length = split.length;
        if(s.contains(" "));
        /*
            计算结果：
                遍历bitSumArray数组的每一位，取每一位和3取余的结果（肯定为0或1）
                并将其 加入到 结果result的适当位上
        */
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result += bitSumArray[i] % 3;
        }

        return result;
    }
}
