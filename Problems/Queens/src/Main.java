// Posted from EduTools plugin
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> queensCoordinates = new ArrayList<>();
        boolean isPossible = false;

        for (int i = 0; i < 4; i++) {
            queensCoordinates.add(scanner.nextInt());
        }

        for (int i = 0; i < 2; i++) {
            boolean theSameCoordinates = queensCoordinates.get(i).equals(queensCoordinates.get(i + 2));
            boolean equallyIncreasedCoordinates = Math.abs(queensCoordinates.get(0) - queensCoordinates.get(2)) ==
                    Math.abs(queensCoordinates.get(1) - queensCoordinates.get(3));
            if (theSameCoordinates || equallyIncreasedCoordinates) {
                isPossible = true;
            }
        }

        if (isPossible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}