package AbstractFactoryPatternCabServices;

public abstract class City {
    public String cabType;
    public abstract void returnFare(String cabType);
}
