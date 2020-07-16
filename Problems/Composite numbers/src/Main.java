import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        if (number >= -2 && number <= 2) {
            return false;
        }
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return true;
            }
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}