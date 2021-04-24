package LeetCode;
//买入股票的最佳时机

//动态规划max={前i-1天的最大收益，当天的最大收益}，买入价格={前i-1天的最低价格，当天的价格}
public class leetcode_121 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    /**
     * 输入: [7,1,5,3,6,4]
     * 输出: 5
     * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        if (prices.length<=1||prices.length==0||prices==null){
            return 0;
        }
        //dp思想
        //1.记录今天买入的最小值
        //2.记录今天卖出的最大值
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
