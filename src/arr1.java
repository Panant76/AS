public class arr1 {
//1. Используя циклы, заполнить массив размером 10 числами от 1 до 10. Распечатать массив.
    public static void main(String[] args) {
        int[] array=new int[10];
        int i=0;
        while(i< array.length) {
            array[i] = i+1;
            System.out.print(array[i]+",");
            i++;
        }
    }
}
