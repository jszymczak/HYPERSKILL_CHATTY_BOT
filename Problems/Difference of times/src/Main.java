import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> momentsOfTime = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            momentsOfTime.add(scanner.nextInt());
        }

        long firstTime = momentsOfTime.get(0) * 3600 + momentsOfTime.get(1) * 60 + momentsOfTime.get(2);
        long secondTime = momentsOfTime.get(3) * 3600 + momentsOfTime.get(4) * 60 + momentsOfTime.get(5);
        long finalSeconds;

        if (firstTime > secondTime) {
            finalSeconds = firstTime - secondTime;
            } else {
            finalSeconds = secondTime - firstTime;
            }

        System.out.println(finalSeconds);
    }
}