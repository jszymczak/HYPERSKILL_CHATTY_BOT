import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= myNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                count++;
                if (count == myNumber) {
                    break;
                }
            }
            if (count == myNumber) {
                break;
            }
        }
    }
}