 public class VehicleInsuranceTest{
	public static void main(String []args)
	{
		Vehicle v=new Vehicle();
		v.setVehicleType("Car");
		v.setVehicleAge(6);
		
		v.displayDetails();
		
		InsurancePremium p=InsurancePremium.calculatePremiumAmount(v);
		 
		System.out.println("Insurance Premium: "+ p.getPremiumAmount() +"% of vehicle value.");
	}
}

class Vehicle
{
	private String vehicleType;
	private int vehicleAge;
	
	public void setVehicleType(String vehicleType)
	{
		this.vehicleType=vehicleType;
	}
	public void setVehicleAge(int vehicleAge)
	{
		this.vehicleAge=vehicleAge;
	}
	
	public String getVehicleType()
	{
		return vehicleType;
	}
	public int getVehicleAge()
	{
		return vehicleAge ;
	}
	
	public void displayDetails()
	{
		System.out.println("Vehicle Type : "+vehicleType);
		System.out.println("Vehicle Age : "+vehicleAge);
	}
}

class InsurancePremium{
	private static double premiumAmount;
	
	public double getPremiumAmount()
	{
		return premiumAmount;
	}
	public static InsurancePremium calculatePremiumAmount(Vehicle v)
	{
		InsurancePremium ip=new InsurancePremium();
		if(v.getVehicleType().equalsIgnoreCase("Car"))
		{
			if(v.getVehicleAge() < 5)
			{
				ip.premiumAmount=5;
			}
			else if(v.getVehicleAge() >= 5 && v.getVehicleAge() <10)
			{
				ip.premiumAmount=7;			
			}
			else {
				ip.premiumAmount=10;	
			}
		}
		else if(v.getVehicleType().equalsIgnoreCase("Motorcycle"))
		{
			if(v.getVehicleAge() < 3)
			{
				ip.premiumAmount=3;
			}
			else if(v.getVehicleAge() >= 3 && v.getVehicleAge() <8)
			{
				ip.premiumAmount=5;			
			}
			else {
				ip.premiumAmount=8;	
			}
		}
		else if(v.getVehicleType().equalsIgnoreCase("Truck"))
		{
			if(v.getVehicleAge() < 5)
			{
			    ip.premiumAmount=6;
			}
			else if(v.getVehicleAge() >= 5 && v.getVehicleAge() <10)
			{
				ip.premiumAmount=8;			
			}
			else {
				ip.premiumAmount=12;	
			}
		}
		return ip;
	}
}



/*
Vehicle Type : Car
Vehicle Age : 6
Insurance Premium: 7.0% of vehicle value.
 * */
 */