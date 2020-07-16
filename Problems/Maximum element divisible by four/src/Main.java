import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int maxValue = 0;
        int tempValue;

        for (int i = 0; i < numberOfElements; i++) {
            tempValue = scanner.nextInt();
            if (tempValue % 4 == 0 && tempValue > maxValue) {
                maxValue = tempValue;
            }
        }

        System.out.println(maxValue);
    }
}