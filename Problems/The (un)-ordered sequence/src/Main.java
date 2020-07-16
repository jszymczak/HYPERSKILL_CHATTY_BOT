import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> allNumbers = new ArrayList<>();
        int tempNumber;
        boolean isAscending = false;
        boolean isDescending = false;
        boolean isOneElement = false;

        while (scanner.hasNextInt()) {
            tempNumber = scanner.nextInt();

            if (tempNumber != 0) {
                allNumbers.add(tempNumber);
            } else {
                break;
            }
        }

        if (allNumbers.size() == 1) {
            isOneElement = true;
        } else {
            for (int i = 1; i < allNumbers.size(); i++) {
                if (allNumbers.get(i - 1) <= allNumbers.get(i)) {
                    isAscending = true;
                } else if (allNumbers.get(i - 1) >= allNumbers.get(i)) {
                    isDescending = true;
                }
            }
        }

        boolean isSequence = isAscending ^ isDescending ||
                    isDescending ^ isAscending;
        if (isSequence || isOneElement) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}