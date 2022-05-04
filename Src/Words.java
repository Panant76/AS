import java.util.Arrays;
    public class Words {
        public static void main(String[] args) {

            String[] arr = {"Lada", "Toyota", "Bentley", "Mercedes", "BMW", "Wolkswagen",
                            "Brabus", "Shkoda", "Scania", "Volvo", "Chevrolet", "Jaguar",
                            "Nissan", "Mitsubishi", "Mazda", "MAZ", "KAMAZ", "TATRA", "Fiat"};

            Arrays.sort(arr,String::compareToIgnoreCase);
            System.out.println(Arrays.toString(arr));
        }
    }

