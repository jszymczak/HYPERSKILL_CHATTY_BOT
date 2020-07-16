import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int durationInDays = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int nightInHotel = scanner.nextInt();

        int food = durationInDays * foodPerDay;
        int flight = 2 * flightCost;
        int accommodation = (durationInDays - 1) * nightInHotel;
        int sumOfVacation = food + flight + accommodation;

        System.out.println(sumOfVacation);
    }
}