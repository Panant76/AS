import java.util.Arrays;

public class arr5 {
    //5. Используя циклы, заполнить массив размером 20 числами, которые лежат в промежутке от 1 до 20.
// Нечётные числа заменить на число 1
    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            if (array[i] % 2 != 0)
                array[i] = 1;
        }
        System.out.println(Arrays.toString(array));
    }
}


