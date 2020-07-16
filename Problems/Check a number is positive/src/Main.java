// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer firstNumber = scanner.nextInt();

        if (firstNumber > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}