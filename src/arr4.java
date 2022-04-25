public class arr4 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{83, 17, 0, 0, 31, 0, 2, 7, 93, 0, 61, 0, 22};
        int j = 0;
        int i=0;
        while ( i < arr1.length) {
            if (arr1[i] != 0) {
                int t=arr1[j];// Почему именно переменной?
                arr1[j] = arr1[i];
                arr1[i] = t;
                j++;
            }
            i++;
            }
        int n=0;
        while (n<arr1.length){
            System.out.print(arr1[n]+",");
        n++;
        }
        }
    }
