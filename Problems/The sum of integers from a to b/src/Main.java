import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var1 = scanner.nextInt();
        int var2 = scanner.nextInt();
        int sumOfIntegers = 0;

        for (int i = var1; i <= var2; i++) {
            sumOfIntegers += i;
        }

        System.out.println(sumOfIntegers);
    }
}