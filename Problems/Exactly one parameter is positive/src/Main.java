import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myIntegerNumbers = new ArrayList<>();
        Integer counter = 0;
        for (int i = 0; i < 3; i++) {
            myIntegerNumbers.add(scanner.nextInt());
            if (myIntegerNumbers.get(i) > 0) {
                counter++;
            }
        }

        if (counter == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}