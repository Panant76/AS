public class arr2 {
    public static void main(String[] args) {
        int[] array=new int[10];
        int i=0;
        while(i< array.length) {
            array[i] = 10-i;
            System.out.print(array[i]+",");
            i++;
        }
    }
}

