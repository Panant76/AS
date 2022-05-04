import java.util.Arrays;

public class arr61 {
    //1. Дан массив чисел {83, 17, 0, 0, 31, 0, 2, 7, 93, 0, 61, 0, 22}.
// Не создавая других массивов, сделать так, чтобы нули, содержащиеся в массиве сместились в конец,
// числа отличные от 0 остались в начале, сохранив свой порядок.
// С одним массивом
    public static void main(String[] args) {
        int[] arr1 = new int[]{83, 17, 0, 0, 31, 0, 2, 7, 93, 0, 61, 0, 22};
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 0) {
                int t = arr1[j];
                arr1[j] = arr1[i];
                arr1[i] = t;
                j++;
            }
        }
        System.out.print(Arrays.toString(arr1));
    }
}

