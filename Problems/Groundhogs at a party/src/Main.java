import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peanutButterCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean isSuccess = false;

        if (peanutButterCups >= 10 && peanutButterCups <= 20 && !isWeekend ||
                peanutButterCups >= 15 && peanutButterCups <= 25 && isWeekend) {
            isSuccess = true;
            System.out.println(isSuccess);
        } else {
            System.out.println(isSuccess);
        }

    }
}