import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(scanner.next());
        }
        for (String word : list) {
            System.out.println(word);
        }
    }
}