/*
2-The program reads the temperature in centigrade from the user using the command line arguments.

Method :

Name : printTemperatureState
returnType : void
methodType : static 
Parameter:  int Temp 

Logic: Determines the state of the weather based on the given temperature using a series of if-else statements.

Temp < 0 then Freezing weather
Temp 0-10 then Very Cold weather
Temp 10-20 then Cold weather
Temp 20-30 then Normal in Temp
Temp 30-40 then Its Hot
Temp >=40 then Its Very Hot

Output: Prints the temperature and the corresponding state message directly from this method.
Main Method:

It handles user input and calls the printTemperatureState method with the gathered temperature.

 */
public class temperatureDetermine {
    static void printTemperatureState(int temp)
    {
        if(temp<0)  System.out.println("Freezing Weather");
        else if(temp >=0 && temp <10) System.out.println("Very Cold Weather");
        else if(temp >=10 && temp <20) System.out.println("Cold Weather");
        else if(temp >=20 && temp <30) System.out.println("Normal in Temp");
        else if(temp >=30 && temp <40) System.out.println("Its Hot");
        else System.out.println("Its Very hot");
    }
    public static void main(String[] args) {
        printTemperatureState(Integer.parseInt(args[0]));
    }
}

/*
PS C:\Users\swapn\Programs\Java\LabPrograms\Day 7> java temperatureDetermine 12
Cold Weather
PS C:\Users\swapn\Programs\Java\LabPrograms\Day 7> java temperatureDetermine 99
Its Very hot
 */