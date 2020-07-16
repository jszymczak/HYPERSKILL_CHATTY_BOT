import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp;
        while (scanner.hasNext()) {
            temp = scanner.nextInt();

            if (temp == 0) {
                break;
            } else {
                if (temp % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            }
        }
    }
}