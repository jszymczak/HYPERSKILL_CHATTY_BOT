import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int reverse = 0;

        while (firstNumber != 0) {
            reverse *= 10;
            reverse = reverse + firstNumber % 10;
            firstNumber /= 10;
        }

        System.out.println(reverse);
    }
}