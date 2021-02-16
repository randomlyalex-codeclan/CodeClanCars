package Car;

import Car.Parts.Engine.Electric;
import Car.Parts.Engine.Engine;

public class ElectricCar extends Car{

    private Electric secondEngine;

    public ElectricCar(Electric engine, String tyres, String colour, double price) {
     super(engine,tyres,colour,price);
    }

    public ElectricCar(Electric engine, Electric secondEngine, String tyres, String colour, double price) {
        super(engine,tyres,colour,price);
        this.secondEngine = secondEngine;
    }


}
