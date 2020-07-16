import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myNumber = scanner.next();
        String numberOfTens;
        Integer textLength = myNumber.length();

        if (textLength.equals(1) && !textLength.equals(0)) {
            numberOfTens = "0";
        } else {
            numberOfTens = myNumber.substring(textLength - 2, textLength - 1);
        }

        System.out.println(numberOfTens);

    }
}