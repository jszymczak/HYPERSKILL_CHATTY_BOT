import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        boolean response;
        Character character = ch;
        character = Character.toLowerCase(character);
        response = character.equals('a') || character.equals('o') ||
                character.equals('e') || character.equals('i') ||
                character.equals('u') ? true : false;
        return response;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}