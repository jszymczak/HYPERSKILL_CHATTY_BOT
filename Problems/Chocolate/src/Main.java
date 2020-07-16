import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer nParamLength = scanner.nextInt();
        Integer mParamWidth = scanner.nextInt();
        Integer kParamBits = scanner.nextInt();

        boolean chocolateLength = kParamBits % nParamLength == 0;
        boolean chocolateWidth = kParamBits % mParamWidth == 0;
        boolean enoughBits = nParamLength * mParamWidth > kParamBits;

        if (enoughBits && (chocolateLength || chocolateWidth)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}