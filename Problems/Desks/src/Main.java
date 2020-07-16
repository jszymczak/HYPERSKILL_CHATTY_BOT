import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberOfStudents = new ArrayList<>();
        int sumOfTables = 0;

        for (int i = 0; i < 3; i++) {
            numberOfStudents.add(scanner.nextInt());
            if (numberOfStudents.get(i) % 2 == 0) {
                sumOfTables += numberOfStudents.get(i) / 2;
            } else {
                sumOfTables += numberOfStudents.get(i) / 2 + 1;
            }
        }

        System.out.println(sumOfTables);
    }
}