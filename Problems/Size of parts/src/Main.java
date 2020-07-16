import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfParts = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < numberOfParts; i++) {
            int part = scanner.nextInt();
            if (part == 1) {
                larger++;
            } else if (part == -1) {
                smaller++;
            } else if (part == 0) {
                perfect++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);    }
}