package LeetCode;
//�����Ʊ�����ʱ��

//��̬�滮max={ǰi-1���������棬������������}������۸�={ǰi-1�����ͼ۸񣬵���ļ۸�}
public class leetcode_121 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    /**
     * ����: [7,1,5,3,6,4]
     * ���: 5
     * ����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ��������������� = 6-1 = 5 ��
     *      ע���������� 7-1 = 6, ��Ϊ�����۸���Ҫ��������۸�ͬʱ���㲻��������ǰ������Ʊ��
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        if (prices.length<=1||prices.length==0||prices==null){
            return 0;
        }
        //dp˼��
        //1.��¼�����������Сֵ
        //2.��¼�������������ֵ
        int min=prices[0];
        int max=0;
        int sum=0;
        for (int i = 1; i < prices.length; i++) {
            max=Math.max(max,prices[i]-min);
            min=Math.min(min,prices[i]);
            sum+=max;
            max=0;

        }
        return max;
    }
}
