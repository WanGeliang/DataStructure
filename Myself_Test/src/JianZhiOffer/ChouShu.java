package JianZhiOffer;

/*
��ֻ����������2��3��5��������������Ugly Number����
����6��8���ǳ�������14���ǣ���Ϊ������������7�� ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
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
     * �����κγ���p��
     * ��һ����ô2*p,3*p,5*p���ǳ���������2*p<3*p<5*p
     * ���������p<q, ��ô2*p<2*q,3*p<3*q,5*p<5*q
     * ����˵˵�㷨˼�룺
     * ����1����С�ĳ�������ô��1��ʼ����2*1��3*1��5*1�����бȽϣ��ó���С�ľ���1
     * ����һ��������Ҳ����2*1��
     * ���ʱ�򣬶���һ��������2����Ҳ���ֶ���3�����ԱȽϵĳ�����2*2��3*2��5*2��
     * ���ʱ��Ͱ�֮ǰ��1�����ɵĳ����͡�2�����ɵĳ����ӽ���Ҳ����
     * (3*1,5*1,2*2��3*2��5*2)���бȽϣ��ҳ���С�ġ����������ѭ����ȥ�ͻᷢ�֣�
     * ÿ��ѡ����һ���������ó����ֻ�����3���µĳ������бȽϡ�
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
