import java.util.Arrays;
public class arr4 {
    //4. Используя циклы, заполнить массив размером 10 чётными числами, которые лежат в промежутке от 20 до 1.
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 2;
        }
        System.out.print(Arrays.toString(array));
        System.out.println();
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.print(Arrays.toString(array));
    }

}








