public class arr5 {
    //5. Используя циклы, заполнить массив размером 20 числами, которые лежат в промежутке от 1 до 20.
// Нечётные числа заменить на число 1
    public static void main(String[] args) {
        int[] array = new int[20];
        int i = 0;
        while (i < array.length) {
            array[i] = i + 1;
            if (i % 2 != 0)
                array[i] = 1;
            //else array[i] = i + 1;
            System.out.print(array[i] + ",");
            i++;
        }
    }
}


