import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myNumber = scanner.next();
        Integer sumOfDigits = 0;

        for (int i = 0; i < 3; i++) {
            sumOfDigits += Integer.parseInt(myNumber.substring(i, i + 1));
        }
        System.out.println(sumOfDigits);
    }
}