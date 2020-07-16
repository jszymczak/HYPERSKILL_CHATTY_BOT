import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;
        int temp;

        while (scanner.hasNext()) {
            temp = scanner.nextInt();
            if (temp % 4 == 0 && temp > maxNumber) {
                maxNumber = temp;
            }
        }
        System.out.println(maxNumber);
    }
}