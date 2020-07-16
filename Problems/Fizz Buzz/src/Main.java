// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer intervalBegin = scanner.nextInt();
        Integer intervalEnd = scanner.nextInt();

        for (int i = intervalBegin; i <= intervalEnd; i++) {

            boolean isDivisibleByThree = i % 3 == 0;
            boolean isDivisibleByFive = i % 5 == 0;

            if (isDivisibleByFive && isDivisibleByThree) {
                System.out.println("FizzBuzz");
            } else if (isDivisibleByThree) {
                System.out.println("Fizz");
            } else if (isDivisibleByFive) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }
}