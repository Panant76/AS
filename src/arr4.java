import java.util.Arrays;

public class arr4 {
    //4. Используя циклы, заполнить массив размером 10 чётными числами, которые лежат в промежутке от 20 до 1.
    public static void main(String[] args) {
        int[] array = new int[10];
        int b = 20;
        for (int i = 0; i < array.length; i++) {
            array[i] = b;
            b = b - 2;
        }
        System.out.print(Arrays.toString(array));
        System.out.println();
    }

}








