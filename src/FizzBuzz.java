import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
    public static List<String> fizzBuzz(int n) {

        ArrayList<String> fizzBuzzArrayList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzArrayList.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                fizzBuzzArrayList.add("Fizz");
            }
            else if (i % 5 == 0) {
                fizzBuzzArrayList.add("Buzz");
            }
            else fizzBuzzArrayList.add(String.valueOf(i));
        }

        return fizzBuzzArrayList;
    }
}
