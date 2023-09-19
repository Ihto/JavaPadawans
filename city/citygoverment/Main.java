import java.util.Scanner;

public class Main {
    public static final int TAX_RATE = 34;

    public static void main(String[] args) {
        City myCity = new City("Stuttgart");
        askForTheBuilding(myCity);

    }

    private static void askForTheBuilding(City myCity) {
        int answer = 0;
        while (answer!=2) {
            System.out.println("Do you want to add a building? ");
            System.out.println("1. Yes");
            System.out.println("2. No");
            Scanner myScanner = new Scanner(System.in);
            answer = myScanner.nextInt();
            if (answer == 1) {
                createBuilding(myCity, myScanner);
            } else if (answer == 2) {
                System.out.println("Have a nice day! ");
            } else {
                System.out.println("Invalid input. Please give 1. Yes or 2. No");
            }
        }
    }

    private static void createBuilding(City myCity, Scanner myScanner) {
        System.out.println("Please give building size in square Meters: ");
        int squareMeters = myScanner.nextInt();
        Building building = new Building(squareMeters);
        Building[] buildings = myCity.getBuildings();
        buildings[0] = building;
    }
}
