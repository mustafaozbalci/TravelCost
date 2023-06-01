import java.util.Scanner;
public class TravelCost {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total distance (in km): ");
		int km = scanner.nextInt();
		System.out.println("Enter the liter price of gasoline : ");
		double Price = scanner.nextDouble();
		System.out.println("Enter the average amount of fuel consumed by the car per 100km: ");
		double Consume = scanner.nextDouble();
		double TotalPrice = ( km/Consume) * Price;
		System.out.println("Total cost of this road : " + TotalPrice);
		
	}

}
