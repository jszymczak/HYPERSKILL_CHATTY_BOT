import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long myNumber = scanner.nextLong();
        long factorial = 1;
        int kCounter = 1;
        do {
            factorial = factorial * kCounter;
            if (factorial <= myNumber) {
                kCounter++;
            }
        } while (factorial < myNumber);

        System.out.println(kCounter);
    }
}