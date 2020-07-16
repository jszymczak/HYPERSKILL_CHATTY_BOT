import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listOfNumbers.add(scanner.nextInt());
        }
        if (listOfNumbers.get(0) + listOfNumbers.get(1) == 20 ||
                listOfNumbers.get(0) + listOfNumbers.get(2) == 20 ||
                listOfNumbers.get(1) + listOfNumbers.get(2) == 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}