public class trainCheck {
    public static void main(String[] args) {
        train tc=new train();
        tc.trainName="VandheBharatExpress";
        tc.departureTime=7;
        tc.timeRequired=6;
        tc.boardingStation="";
        tc.destination="mumbai";
        tc.trainDetails();
    }
}

class train{
    String trainName;
    double departureTime;
    String destination;
    String boardingStation;
    double timeRequired;
// public void setName
    public void trainDetails()
    {
        System.out.println(trainName+" departs at "+departureTime+"pm and takes "+timeRequired+"hrs to reach the "+destination);    
    }
}
