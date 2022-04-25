import java.util.Arrays;
//2. Дан массив чисел {12, 83, 17, 31, 2, 7, 93, 76, 61, 22, 45, 98, 53, 16, 13}.
// Отсортировать числа в массиве так, чтобы по очереди чередовались четные и нечетные числа.
// Если четных или нечетных окажется больше, то они должны идти по порядку в хвосте массива.
public class arr7 {
    public static void main(String[] args) {
        int[] array = new int[]{12, 83, 17, 31, 2, 7, 93, 76, 61, 22, 45, 98, 53, 16, 13};
          for (int i=0;i < array.length;i++) {
            int value = array[i];
            int n = i - 1;
            for (; n >= 0; n--) {
                if (value < array[n] && value %2==0) {
                    array[n + 1] = array[n];
                } else {
                    break;
                }
            }
            array[n + 1] = value;
        }
        System.out.print(Arrays.toString(array));
    }
}
