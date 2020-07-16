import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfElements = 0;
        int temp = 0;
        while (scanner.hasNext()) {
            temp = scanner.nextInt();
            if (temp == 0) {
                break;
            } else {
                sumOfElements += temp;
                if (sumOfElements >= 1000) {
                    sumOfElements -= 1000;
                    break;
                }
            }
        }
        System.out.println(sumOfElements);
    }
}