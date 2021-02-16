package Car;

import Car.Parts.Engine.Electric;
import Car.Parts.Engine.ICE;

public class ICECar extends Car{
    public ICECar(ICE engine, String tyres, String colour, double price) {
        super(engine,tyres,colour,price);
    }
}
