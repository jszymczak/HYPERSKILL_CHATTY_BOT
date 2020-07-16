import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        Integer firstInt = scanner.nextInt();
        Integer secondInt = scanner.nextInt();
        String output = myString.substring(firstInt, secondInt + 1);
        System.out.println(output);
    }
}