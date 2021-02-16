package Car.Parts.Engine;

public class Electric extends Engine{

    private EFuelType fuelType;
    private int kWOutput;

    public Electric(int kWOutput){
        this.fuelType = EFuelType.ELECTRIC;
        this.kWOutput = kWOutput;
    }

}
