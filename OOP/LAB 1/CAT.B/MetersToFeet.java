import java.util.Scanner;

public class MetersToFeet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in meters: ");
        double meters = scanner.nextDouble();
        double feet = meters * 3.28084; // 1 meter = 3.28084 feet
        System.out.println(meters + " meters is equal to " + feet + " feet.");
        scanner.close();
    }
}
