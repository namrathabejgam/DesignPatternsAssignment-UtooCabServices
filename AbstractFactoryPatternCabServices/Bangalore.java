package AbstractFactoryPatternCabServices;

public class Bangalore extends City {
    //String cabType;
    public Bangalore(String cabType)
    {
        super.cabType=cabType;
    }

    @Override
    public void returnFare(String cabType) {
    if(cabType.equalsIgnoreCase("micro"))
    {
        System.out.println("Fare for "+cabType+" is 230");
    }
    else if(cabType.equalsIgnoreCase("mini"))
    {
        System.out.println("Fare for "+cabType+" is 290");
    }
    else if(cabType.equalsIgnoreCase("sudan"))
    {
        System.out.println("Fare for "+cabType+" is 310");
    }
    else if(cabType.equalsIgnoreCase("suv"))
    {
        System.out.println("Fare for "+cabType+" is 410");
    }
    }
}
