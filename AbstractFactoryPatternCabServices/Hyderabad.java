package AbstractFactoryPatternCabServices;
public class Hyderabad extends City {
   public Hyderabad(String cabType)
   {
       super.cabType=cabType;
   }
    @Override
    public void returnFare(String cabType) {
        if(cabType.equalsIgnoreCase("micro"))
        {
            System.out.println("Fare for "+cabType+" is 220");
        }
        else if(cabType.equalsIgnoreCase("mini"))
        {
            System.out.println("Fare for "+cabType+" is 280");
        }
        else if(cabType.equalsIgnoreCase("suv"))
        {
            System.out.println("Fare for "+cabType+" is 400");
        }
        else
        {
            System.out.println("Sorry! Cab type currently not available");
        }
    }
}
