import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer myYear = scanner.nextInt();
        boolean isLeapYear = myYear % 4 == 0 && myYear % 100 != 0 || myYear % 400 == 0;

        if (isLeapYear) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}