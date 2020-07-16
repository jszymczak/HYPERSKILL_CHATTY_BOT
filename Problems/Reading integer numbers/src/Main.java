import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> myNumbers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            myNumbers.add(scanner.next());
        }

        for (String number:myNumbers) {
            System.out.println(number);
        }
    }
}