package LeetCode;
//������Ʊ�����ʱ��2
//�����Խ��������Ķ�ι���
//ϸ�ڣ���������֮�󣬵��컹��������
public class leetcode_122 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        if (prices.length<=1||prices.length==0||prices==null){
            return 0;
        }
        //ֻҪ��һ���ֵ��ǰһ���ֵ�󣬾�������ǵ�ֵ
        int ans=0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]>prices[i-1]){
                ans+=prices[i]-prices[i-1];
            }
        }
        return  ans;
    }

}
