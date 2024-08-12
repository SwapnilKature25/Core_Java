import java.util.Scanner;

 class Car {
    public String company;
    public String model;
    public int year;
    public String mileage;

    // Method to initialize car details using Scanner
    public void setCarDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the company name: ");
        company = scanner.nextLine();

        System.out.print("Enter the model name: ");
        model = scanner.nextLine();

        System.out.print("Enter the manufacturing year: ");
        year = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter the mileage: ");
        mileage = scanner.nextLine();
    }

    public void display() {
        System.out.println("Car Details:");
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }
}



public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println("Enter details for the first car:");
        car1.setCarDetails();

        Car car2 = new Car();
        System.out.println("Enter details for the second car:");
        car2.setCarDetails();

        System.out.println("\nDetails of the first car:");
        car1.display();

        System.out.println("\nDetails of the second car:");
        car2.display();
    }
}


