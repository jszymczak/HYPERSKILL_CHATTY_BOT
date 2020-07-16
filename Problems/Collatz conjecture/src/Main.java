import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();

        System.out.print(myNumber + " ");

        while (myNumber != 1) {
            if (myNumber % 2 == 0) {
                myNumber /= 2;
            } else {
                myNumber = myNumber * 3 + 1;
            }
            System.out.print(myNumber + " ");
        }
    }
}