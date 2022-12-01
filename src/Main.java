import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {





        Random random = new Random();
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
        ArrayList<Integer> exactNumber = new ArrayList<>();
        ArrayList<Integer> evenNumber = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            int number = (random.nextInt(1, 100));
            if (number % 2 == 0) {
                evenNumber.add(number);

            }else{
                exactNumber.add(number);

            }

        }System.out.println("Even number: "+evenNumber);
        System.out.println("Exact number: "+exactNumber);
        numbers.add(evenNumber);
        numbers.add(exactNumber);
        System.out.println(numbers);


    }
}