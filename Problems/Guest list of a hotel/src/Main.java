//put imports you need here

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        for (int i = 0; i<4; i++) {
            names.addAll(Arrays.asList(scanner.nextLine().split(" ")));
        }

        Collections.reverse(names);

        for (String name: names) {
            System.out.println(name);
        }
    }
}