package AbstractFactoryPatternCabServices;
import java.util.Scanner;
public class UtooCabServices {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the type of cab(Micro/Mini/Sudan/SUV)");
        String cabchoice=scanner.nextLine();
        Cab cab=null;
        if(cabchoice.equalsIgnoreCase("micro"))
        {
            cab=new Micro();
        }
        else if(cabchoice.equalsIgnoreCase("mini"))
        {
            cab=new Mini();
        }
        else if(cabchoice.equalsIgnoreCase("sudan"))
        {
            cab=new Sudan();
        }
        else if(cabchoice.equalsIgnoreCase("suv"))
        {
            cab=new SUV();
        }
        System.out.println("Enter your current city(Hyderabad/Bangalore/Chennai)");
        String citychoice=scanner.nextLine();
        City city=null;
        if(citychoice.equalsIgnoreCase("Hyderabad"))
            city = new Hyderabad(cab.returnCabType());
        else if(citychoice.equalsIgnoreCase("Bangalore"))
        {
            city=new Bangalore(cab.returnCabType());
        }
        else if(citychoice.equalsIgnoreCase("Chennai"))
        {
            city=new Chennai(cab.returnCabType());
        }
        city.returnFare(city.cabType);
    }
}
