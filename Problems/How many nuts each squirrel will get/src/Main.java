import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSquirrels = scanner.nextInt();
        int numberOfNuts = scanner.nextInt();
        int nutPerSquirrel;

        while (numberOfNuts % numberOfSquirrels != 0) {
            numberOfNuts--;
        }

        nutPerSquirrel = numberOfNuts / numberOfSquirrels;

        System.out.println(nutPerSquirrel);
    }
}