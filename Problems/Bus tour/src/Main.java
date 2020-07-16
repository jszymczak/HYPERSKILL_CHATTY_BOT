import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightOfTheBus = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();

        for (int i = 1; i <= numberOfBridges; i++) {
            if (heightOfTheBus >= scanner.nextInt()) {
                System.out.println("Will crash on bridge " + i);
                break;
            } else if (i == numberOfBridges) {
                System.out.println("Will not crash");
            }
        }
    }
}