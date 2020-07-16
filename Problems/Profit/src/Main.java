import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float moneyOfAnn = scanner.nextFloat();
        float percent = scanner.nextFloat() / 100;
        int kAmount = scanner.nextInt();
        int counter = 0;

        while (moneyOfAnn < kAmount) {
            moneyOfAnn = moneyOfAnn + moneyOfAnn * percent;
            counter++;
        }
        System.out.println(counter);
    }
}