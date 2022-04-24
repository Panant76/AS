import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        int[] arr1 = new int[]{83, 17, 0, 0, 31, 0, 2, 7, 93, 0, 61, 0, 22};
        int[] arr2 = new int[arr1.length];
        int n = 0;
        int m = arr1.length -1;
        int i=0;
        while( i<arr1.length){
        //for (int i = 0; i < arr.length; i++) {
            if (arr1[i] == 0) {
                arr2[m] = 0;
                m--;
            } else {
                arr2[n] = arr1[i];
                n++;
            }i++;
        }
        System.out.println(Arrays.toString(arr2));
    }

}

   /* public static void moveNullToTheEnd(int[] arr) {

        int[] temp = new int[arr.length];
        int counter = 0;
        int nullcounter = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                temp[nullcounter] = 0;
                nullcounter--;

            } else {
                temp[counter] = arr[i];
                counter++;

            }
        }
        arr = temp;

        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {
        int[] test = new int[]{0, 2, 0, 34, 4,0,89,67,45,0};
        moveNullToTheEnd(test);
    }
}
*/