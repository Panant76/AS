import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {
        int[] array = new int[10];
        arr(array);
        arr1(array);
        arr2(array);
        arr3(array);
    }

    private static void arr(int[] array) { //1. Используя циклы, заполнить массив размером 10 числами от 1 до 10. Распечатать массив.
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void arr1(int[] array) {  //2. Используя циклы, заполнить массив размером 10 числами от 10 до 1. Распечатать массив.
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 - i;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void arr2(int[] array) { //3. Используя циклы, заполнить массив размером 10 чётными числами, которые лежат в промежутке от 1 до 20.
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 2;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void arr3(int[] array) { //4. Используя циклы, заполнить массив размером 10 чётными числами, которые лежат в промежутке от 20 до 1.
        int b = 20;
        for (int i = 0; i < array.length; i++) {
            array[i] = b;
            b -= 2;
        }
        System.out.println(Arrays.toString(array));
    }

}

