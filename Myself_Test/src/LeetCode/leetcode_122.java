package LeetCode;
//买卖股票的最佳时机2
//不可以进行连续的多次购买
//细节：当天卖出之后，当天还可以买入
public class leetcode_122 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        if (prices.length<=1||prices.length==0||prices==null){
            return 0;
        }
        //只要后一天的值比前一天的值大，就相加他们的值
        int ans=0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]>prices[i-1]){
                ans+=prices[i]-prices[i-1];
            }
        }
        return  ans;
    }

}
