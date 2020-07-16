import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        boolean areEqual = firstString.replace(" ", "")
                                      .equalsIgnoreCase(secondString.replace(" ", ""));
        System.out.println(areEqual);
    }
}