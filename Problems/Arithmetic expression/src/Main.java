import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();
        int myOutput = ((myNumber + 1) * myNumber + 2) * myNumber + 3;

        System.out.println(myOutput);
    }
}