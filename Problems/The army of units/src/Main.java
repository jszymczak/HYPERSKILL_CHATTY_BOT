// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer myNumber = scanner.nextInt();

        if (myNumber < 1) {
            System.out.println("no army");
        } else if (myNumber >= 1 && myNumber < 20) {
            System.out.println("pack");
        } else if (myNumber >= 20 && myNumber < 250) {
            System.out.println("throng");
        } else if (myNumber >= 250 && myNumber < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }

    }
}