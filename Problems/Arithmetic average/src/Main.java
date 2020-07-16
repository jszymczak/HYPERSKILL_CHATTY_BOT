import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int countOfDivisibleNumbers = 0;
        double sumOfDivisibleNumbers = 0.00;
        double arithmeticAverage = 0.00;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sumOfDivisibleNumbers += i;
                countOfDivisibleNumbers++;
            }
        }
        arithmeticAverage = sumOfDivisibleNumbers / countOfDivisibleNumbers;
        System.out.println(arithmeticAverage);
    }
}