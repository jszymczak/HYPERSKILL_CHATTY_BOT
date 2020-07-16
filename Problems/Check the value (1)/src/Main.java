import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer myInt = scanner.nextInt();
        if (myInt < 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}