import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args)
    {
        // TODO: Get user input for trip details
        Scanner sc = new Scanner(System.in);
        // - Distance (miles)
        System.out.print("Enter trip distance (miles): ");
        double distance = sc.nextDouble();
        // - Average speed (mph)
        System.out.print("Enter average speed (mph): ");
        double speed = sc.nextDouble();
        // - Fuel efficiency (miles per gallon)
        System.out.print("Enter fuel efficiency (miles per gallon): ");
        double mpg = sc.nextDouble();

        // - Fuel price per gallon
        System.out.print("Enter fuel price per gallon ($): ");
        double price = sc.nextDouble();

        // TODO: Calculate travel time using a return method
        double travelTime = calculateTravelTime(distance, speed);

        // TODO: Calculate fuel needed using a return method
        double fuelNeeded = calculateFuelNeeded(mpg, distance);

        // TODO: Calculate trip cost using a return method
        double cost = calculateTripCost(fuelNeeded, price);

        // TODO: Display results using a void method
        displayResults(travelTime, fuelNeeded, cost);
    }
    
    // TODO: Implement calculateTravelTime method
    public static double calculateTravelTime(double distance, double speed)
    {
        return distance/speed;
    }
    // TODO: Implement calculateFuelNeeded method
    public static double calculateFuelNeeded(double mpg, double distance)
    {
        return distance/mpg;
    }

        // TODO: Implement calculateTripCost method
    public static double calculateTripCost(double fuelNeeded, double price)
    {
        return fuelNeeded*price;
    }
    // TODO: Implement displayResults method
    public static void displayResults(double traveltime, double fuelNeeded, double cost)
    {
        System.out.println("\nResults:");
        System.out.printf("Travel Time: %.2f hours\n", traveltime);
        System.out.printf("Fuel Needed: %.2f gallons\n", fuelNeeded);
        System.out.printf("Trip Cost: $%.2f hours\n", cost);
    }
}
