package AbstractFactoryPatternCabServices;

public class Chennai extends City {
    public Chennai(String cabType)
    {
        super.cabType=cabType;
    }
    @Override
    public void returnFare(String cabType) {
        if(cabType.equalsIgnoreCase("micro"))
        {
            System.out.println("Fare for "+cabType+" is 210");
        }
        else if(cabType.equalsIgnoreCase("mini"))
        {
            System.out.println("Fare for "+cabType+" is 270");
        }
    else if(cabType.equalsIgnoreCase("sudan"))
        {
            System.out.println("Fare for "+cabType+" is 290");
        }
    else
        {
            System.out.println("Sorry! Cab type currently not available");
        }
    }
}
