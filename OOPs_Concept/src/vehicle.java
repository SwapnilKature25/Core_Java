interface vehicle{
    void rent();
     void returnVehicle();
      void displayInfo();
}


abstract class AbstractVehicle implements vehicle{
    private String vehicleNum;
    private boolean isRented;

AbstractVehicle(String vehicleNum,boolean isRented){
    this.vehicleNum=vehicleNum;
    this.isRented=isRented;
}
public String getNum(){
    return this.vehicleNum;
}

public String getIsRented(){
    return this.vehicleNum;
}

protected void setIsRented(boolean isRented){
 this.isRented=isRented;
}

}

class Car extends AbstractVehicle{
    private String carType;

    Car(String vehicleNum,boolean isRented,String carType){
        super(vehicleNum,isRented);
        this.carType=carType;
    }

    public void rent(){
        System.out.println("Car "+getIsRented()+" has been rented.  ");
    }
    public void returnVehicle(){
        System.out.println("Car "+getIsRented()+" has been rented.  ");
    }

    public void displayInfo(){
        System.out.println("vehicle Number: "+getNum()+", Car type: "+carType);
    }
}


class Bike extends AbstractVehicle{
    private boolean hasGears;

    Bike(String vehicleNum,boolean isRented,boolean hasGears){
        super(vehicleNum,isRented);
        this.hasGears=hasGears;
    }

    public void rent(){
        System.out.println("Bike "+getIsRented()+" has been rented.  ");
    }
    public void returnVehicle(){
        System.out.println("Bike "+getIsRented()+" has been rented.  ");
    }

    public void displayInfo(){
        System.out.println("Bike Number: "+getNum()+", Has Gears: "+hasGears);
    }
}

