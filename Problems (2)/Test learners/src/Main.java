class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myChoice = scanner.nextInt;

        switch (myChoice) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2, 3, 4 {
                System.out.println("No");
                break;
            }
            default:
                System.out.println("Unknown number");
                break;
        }
    }
}