import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> triangleSides = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            triangleSides.add(scanner.nextInt());
        }

        boolean firstCheck = triangleSides.get(0) + triangleSides.get(1) > triangleSides.get(2);
        boolean secondCheck = triangleSides.get(0) + triangleSides.get(2) > triangleSides.get(1);
        boolean thirdCheck = triangleSides.get(1) + triangleSides.get(2) > triangleSides.get(0);

        if (firstCheck && secondCheck && thirdCheck) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}