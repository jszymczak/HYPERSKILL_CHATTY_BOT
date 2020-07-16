import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myWord = scanner.next();
        char firstLetter = myWord.charAt(0);
        boolean startsWithJ = firstLetter == 'j' || firstLetter == 'J';
        System.out.println(startsWithJ);
    }
}