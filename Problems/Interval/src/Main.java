import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer myNumber = scanner.nextInt();

        if (myNumber > -15 && myNumber <= 12 || myNumber > 14 && myNumber < 17 || myNumber >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}