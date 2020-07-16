import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myNumber = scanner.next();
        final String twoZeros = "00";
        final String oneZero = "0";
        Integer myNumberLength = myNumber.length();

        boolean trueFor4Length = myNumberLength.equals(4) &&
                myNumber.charAt(0) == myNumber.charAt(3) &&
                myNumber.charAt(1) == myNumber.charAt(2);
        boolean trueFor3Length = myNumberLength.equals(3) &&
                myNumber.charAt(2) == 0 &&
                myNumber.charAt(0) == myNumber.charAt(1);

        if (trueFor4Length || trueFor3Length || twoZeros.equals(myNumber) || oneZero.equals(myNumber)) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }

    }
}