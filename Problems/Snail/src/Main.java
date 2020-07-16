import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer height = scanner.nextInt();
        Integer feetsUp = scanner.nextInt();
        Integer feetsDown = scanner.nextInt();
        Integer snailPosition = 0;
        Integer daysNumber = 0;

        while (snailPosition < height) {
            snailPosition += feetsUp;
            daysNumber++;
            if (snailPosition < height) {
                snailPosition -= feetsDown;
            }
        }
        System.out.println(daysNumber);
    }
}