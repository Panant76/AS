import java.util.Arrays;
//1. Дан массив чисел {83, 17, 0, 0, 31, 0, 2, 7, 93, 0, 61, 0, 22}.
// Не создавая других массивов, сделать так, чтобы нули, содержащиеся в массиве сместились в конец,
// числа отличные от 0 остались в начале, сохранив свой порядок.
// С двумя массивами
public class arr6 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{83, 17, 0, 0, 31, 0, 2, 7, 93, 0, 61, 0, 22};
        int[] arr2 = new int[arr1.length];
        int n = 0;
        int m = arr1.length - 1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr2[m] = 0;
                m--;
            } else {
                arr2[n] = arr1[i];
                n++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}

