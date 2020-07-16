import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer checkedInteger = scanner.nextInt();

        boolean comparison = checkedInteger > 0 && checkedInteger < 10;
        System.out.println(comparison);
    }
}