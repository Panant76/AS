public class arr4 {
//4. Используя циклы, заполнить массив размером 10 чётными числами, которые лежат в промежутке от 20 до 1.
            public static void main(String[] args) {
                int[] array = new int[10];
                int i = 0;
                while (i < array.length) {
                    if (i % 2 == 0) {
                        array[i] = (20 - i);
                    }
                        System.out.print(array[i] + "," );
                        i++;
                    }
                }

            }
