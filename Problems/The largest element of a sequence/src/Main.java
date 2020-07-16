import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempInt;
        int maxInt = 0;
        while (scanner.hasNext()) {
            tempInt = scanner.nextInt();
            if (tempInt > maxInt) {
                maxInt = tempInt;
            }
        }
        System.out.println(maxInt);
    }
}