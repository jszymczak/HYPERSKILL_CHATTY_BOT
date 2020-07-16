import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myNumber = scanner.next();
        String myDigit = myNumber.substring(0, 1);

        System.out.println(myDigit);

    }
}