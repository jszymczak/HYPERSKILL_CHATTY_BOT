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

        boolean areDifferent = !listOfNumbers.get(0).equals(listOfNumbers.get(1))
                && !listOfNumbers.get(0).equals(listOfNumbers.get(2))
                && !listOfNumbers.get(1).equals(listOfNumbers.get(2));

        System.out.println(areDifferent);

    }
}