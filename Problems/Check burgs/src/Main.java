import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cityName = scanner.nextLine();
        int lengthOfCityName = cityName.length();
        if (lengthOfCityName >= 4) {
            boolean isEqual = cityName.substring(lengthOfCityName - 4, lengthOfCityName)
                    .equalsIgnoreCase("burg");
            System.out.println(isEqual);
        } else {
            System.out.println(false);
        }
    }
}