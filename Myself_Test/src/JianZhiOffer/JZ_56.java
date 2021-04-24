package JianZhiOffer;

//ֻ����һ�ε����֣�����������ѧ����
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

        int[] bitSumArray = new int[32];    // ���ڼ�¼ �������������� �� ÿһλ�ĺ�
        for (int num : nums) {
            /*
                �ɸߵ��ͣ�������ǰ���ֵ�ÿһλ��
                �� ��ǰλΪ1����ʹbitSumArray�������Ӧ�ĵ�Ԫ��ֵ+1
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
            ��������
                ����bitSumArray�����ÿһλ��ȡÿһλ��3ȡ��Ľ�����϶�Ϊ0��1��
                ������ ���뵽 ���result���ʵ�λ��
        */
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result += bitSumArray[i] % 3;
        }

        return result;
    }
}
