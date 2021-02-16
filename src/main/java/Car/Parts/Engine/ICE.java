package Car.Parts.Engine;

public class ICE extends Engine {
    private  ICEFuelType fuelType;
    private int cylinders;
    private int displacement;


    public ICE(ICEFuelType fuelType, int cylinders, int displacement){
        this.fuelType = fuelType;
        this.cylinders = cylinders;
        this.displacement = displacement;

    }
}
