import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myInput = scanner.next();

        String myNewString = myInput.replace('a', 'b');
        System.out.println(myNewString);
    }
}