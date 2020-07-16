import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> boysHeight = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            boysHeight.add(scanner.nextInt());
        }

        boolean orderHeightDescending = boysHeight.get(0) >= boysHeight.get(1)
                                     && boysHeight.get(1) >= boysHeight.get(2);
        boolean orderHeightAscending = boysHeight.get(0) <= boysHeight.get(1)
                                    && boysHeight.get(1) <= boysHeight.get(2);

        System.out.println(orderHeightAscending || orderHeightDescending);
    }
}