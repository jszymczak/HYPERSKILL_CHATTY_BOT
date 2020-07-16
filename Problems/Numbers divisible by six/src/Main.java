import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfDivisibleElements = 0;
        int numberOfElements = scanner.nextInt();
        List<Integer> allElements = new ArrayList<>();

        for (int i = 0; i < numberOfElements; i++) {
            allElements.add(scanner.nextInt());
            if (allElements.get(i) % 6 == 0) {
                sumOfDivisibleElements += allElements.get(i);
            }
        }

        System.out.println(sumOfDivisibleElements);
    }
}