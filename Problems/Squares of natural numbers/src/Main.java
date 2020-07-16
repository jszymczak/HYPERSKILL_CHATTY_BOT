import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();
        int squareNumber = 1;
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.ITALY);
        while (Math.pow(squareNumber, 2) <= myNumber) {
            System.out.println(numberFormat.format(Math.pow(squareNumber, 2)));
            squareNumber++;

        }
    }
}