// Posted from EduTools plugin
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sleepHours = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            sleepHours.add(scanner.nextInt());
        }

        boolean notAtLeast = sleepHours.get(2) < sleepHours.get(0);
        boolean notMoreThan = sleepHours.get(2) > sleepHours.get(1);

        if (notAtLeast) {
            System.out.println("Deficiency");
        } else if (notMoreThan) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }

    }
}