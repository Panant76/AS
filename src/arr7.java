import java.util.Arrays;

//2. Дан массив чисел {12, 83, 17, 31, 2, 7, 93, 76, 61, 22, 45, 98, 53, 16, 13}.
// Отсортировать числа в массиве так, чтобы по очереди чередовались четные и нечетные числа.
// Если четных или нечетных окажется больше, то они должны идти по порядку в хвосте массива.
public class arr7 {
    public static void main(String[] args) {
        int[] array = new int[16];
        int j = 0;
        int h = 0;
        for (int i = 0; i < array.length - 1; i++) {
            array[i]=(int)(Math.random()*6);
            if (array[i] % 2 == 0) {
//                int t = array[j];
//                array[j] = array[i];
//                array[i] = t;
//                j += 2;
                j += array[i];
                h++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Четных чисел в массиве " + h);
        System.out.print("Сумма четных чисел массива  " + j);
    }
}