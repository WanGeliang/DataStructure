package JianZhiOffer;

/*
把只包含质因子2、3和5的数称作丑数（Ugly Number）。
例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class ChouShu {
    public static void main(String[] args) {
        ChouShu md = new ChouShu();
        System.out.println(md.getChouShu(7));
//        md.GetUglyNumber_Solution(7);
        String s;
//        String s = s.replace();

    }

    /**
     * 对于任何丑数p：
     * （一）那么2*p,3*p,5*p都是丑数，并且2*p<3*p<5*p
     * （二）如果p<q, 那么2*p<2*q,3*p<3*q,5*p<5*q
     * 现在说说算法思想：
     * 由于1是最小的丑数，那么从1开始，把2*1，3*1，5*1，进行比较，得出最小的就是1
     * 的下一个丑数，也就是2*1，
     * 这个时候，多了一个丑数‘2’，也就又多了3个可以比较的丑数，2*2，3*2，5*2，
     * 这个时候就把之前‘1’生成的丑数和‘2’生成的丑数加进来也就是
     * (3*1,5*1,2*2，3*2，5*2)进行比较，找出最小的。。。。如此循环下去就会发现，
     * 每次选进来一个丑数，该丑数又会生成3个新的丑数进行比较。
     *
     * @param index
     * @return
     */
    public int getUglyNumberSolution(int index) {
        if (index <= 0) {
            return -1;
        }
        int[] ans = new int[index];
        int p2 = 0, p3 = 0, p5 = 0;
        int number = 1;
        ans[0] = number;
        for (int i = 1; i < index; i++) {
            number = Math.min(Math.min(2 * ans[p2], 3 * ans[p3]), 5 * ans[p5]);
            if (number == ans[p2] * 2) {
                p2++;
            }
            if (number == ans[p3] * 3) {
                p3++;
            }
            if (number == ans[p5] * 5) {
                p5++;
            }
            ans[i] = number;
        }
        return ans[index - 1];
    }

    public int getChouShu(int index) {
        int[] res = new int[index];
        int p2 = 0, p3 = 0, p5 = 0;
        res[0] = 1;
        for (int i = 1; i < index; i++) {
            int number = Math.min(Math.min(2 * res[p2], 3 * res[p3]), 5 * res[p5]);
            if (number == res[p2] * 2) {
                p2++;
            }
            if (number == res[p3] * 3) {
                p3++;
            }
            if (number == res[p5] * 5) {
                p5++;
            }
            res[i] = number;
        }
        return res[index - 1];
    }
}
