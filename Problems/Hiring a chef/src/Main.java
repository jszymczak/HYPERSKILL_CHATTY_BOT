//put imports you need here

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> candidates = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            candidates.add(scanner.next());
        }
        System.out.println("The form for " + candidates.get(0) + " is completed. " +
                            "We will contact you if we need a chef that cooks "
                            + candidates.get(candidates.size()-1) + " dishes.");
    }
}