import java.util.Arrays;
public class arr71 {
    public static void main(String[] args) {
        int[] array = new int[]{12, 83, 17, 31, 2, 7, 93, 76, 61, 22, 45, 98, 53, 16, 13};
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int n = i - 1;
            for (; n >= 0; n--) {
                if (value < array[n]) {
                    array[n + 1] = array[n];
                } else {
                    break;
                }
            }
            array[n + 1] = value;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                int t = array[j];
                array[j] = array[i];
                array[i] = t;
                j += 2;
            }
        }
        System.out.print(Arrays.toString(array));
    }
}