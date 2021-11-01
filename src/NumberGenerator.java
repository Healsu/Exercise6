import java.util.ArrayList;
import java.util.Scanner;

public class NumberGenerator {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumber = new ArrayList();

        for (int i = 1; i < 101; i++) {
            randomNumber.add(i);

        }
        System.out.println(randomNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number multiplied by itself do you want removed? (Note the number itself wont get removed)");
        int userInput = scanner.nextInt();
            randomNumber.remove(userInput);
        for (Integer i = userInput * 2; i <= 100; i += userInput) {
            randomNumber.remove(i);
        }
        System.out.println("The multiplication of the number: "+userInput+", has been removed.");
        System.out.println(randomNumber);
    }
}
