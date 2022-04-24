public class arr3 {
    public static void main(String[] args) {
        int[] array=new int[10];
        int i=0;
        while(i< array.length) {
            array[i]=(i+1)*2;
            System.out.print(array[i]+",");
            i++;
        }
    }
}