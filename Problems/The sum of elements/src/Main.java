import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp;
        int sumOfNumbers = 0;
        do {
            temp = scanner.nextInt();
            sumOfNumbers += temp;
        } while (temp != 0);
        System.out.println(sumOfNumbers);
    }
}