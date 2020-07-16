import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myNumbers = new ArrayList<>();
        Integer fixedNumber = 0;
        for (int i = 0; i < 4; i++) {
            myNumbers.add(scanner.nextInt());
        }
        for (int i = 0; i < 4; i++) {
            fixedNumber = myNumbers.get(i);
            System.out.print(--fixedNumber + " ");
        }
    }
}