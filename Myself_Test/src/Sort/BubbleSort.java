package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 1, 8, 4, 7, 9, 5, 10};
        bubble(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * ц╟ещеепР
     *
     * @param array
     * @return
     */
    public static void bubble(int[] array) {

        int temp;
        boolean flag = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    flag = true;
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
            if (!flag) {
                break;
            } else {
                flag = false;
            }
        }
//        System.out.println(Arrays.toString(array));
    }
}
