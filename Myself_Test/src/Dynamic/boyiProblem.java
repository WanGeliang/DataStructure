//package Dynamic;
//
//
//
//public class boyiProblem {
//    public static void main(String[] args) {
//        int[] piles={3,9,1,3};
//    }
//    /* ������Ϸ������ֺͺ��ֵĵ÷�֮�� */
//    public int stoneGame(int[] piles) {
//        int n=piles.length;
//        Pair[][] dp=new Pair[n][n];
//        //���������б�ű���
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                dp[i][j]=new Pair(0,0);
//            }
//        }
//        //��ʼ��pile�ѣ�
//        for (int i = 0; i < n; i++) {
//            dp[i][i]=new Pair(piles[i],0);
//        }
//
//        for (int i = 1; i < n; i++) {
//            for (int j = 0; j < n-i; j++) {
//                int k=i+j-1;
//                int left=piles[i]+
//            }
//        }
//
//        return 0;
//    }
//}
//
//class Pair {
//    int fir, sec;
//
//    Pair(int fir, int sec) {
//        this.fir = fir;
//        this.sec = sec;
//    }
//}
