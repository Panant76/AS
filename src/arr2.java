public class arr2 {
//2. Используя циклы, заполнить массив размером 10 числами от 10 до 1. Распечатать массив.
    public static void main(String[] args) {
        int[] array=new int[10];
        int i=0;
        while(i< array.length) {
            array[i]=10-i;
            System.out.print(array[i]+",");
            i++;
        }
    }
}

