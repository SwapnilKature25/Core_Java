
public class TestRentalService {
	public static void main(String[] args) {
		Car c=new Car("C123",true ,"Sedan");
		c.rent();
		c.displayInfo();
		c.returnVehicle();
		System.out.println();
		Bike b=new Bike("B456",true ,true);
		b.rent();
		b.displayInfo();
		b.returnVehicle();
		
	}
}
