import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aNumber = scanner.nextInt();
        int bNumber = scanner.nextInt();
        int cNumber = scanner.nextInt();
        int dNumber = scanner.nextInt();
        List<Integer> allRoots = new ArrayList<>();

        for (int i = 0; i <= 1000; i++) {
            boolean isRoot = aNumber * Math.pow(i, 3) +
                    bNumber * Math.pow(i, 2) + cNumber * i +
                    dNumber == 0;
            if (isRoot) {
                allRoots.add(i);
            }
        }

        int allRootsSize = allRoots.size();

        if (allRootsSize == 1) {
            System.out.println(allRoots.get(0));
        } else if (allRootsSize == 2) {
            int firstElement = allRoots.get(0);
            int secondElement = allRoots.get(1);
            boolean firstIsGreater = firstElement >= secondElement;
            if (firstIsGreater) {
                System.out.println(secondElement + "\n" + firstElement);
            } else {
                System.out.println(firstElement + "\n" + secondElement);
            }
        }
    }
}