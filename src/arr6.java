public class arr6 {

        public static void main(String[] args) {
            int[] array=new int[20];
            int i=0;
            while(i< array.length) {
                if(i%2==0)
                array[i] = 1;
                else array[i]=i+1;
                System.out.print(array[i]+",");
                i++;
            }
        }
    }


