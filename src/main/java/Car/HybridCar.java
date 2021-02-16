package Car;

import Car.Parts.Engine.Electric;
import Car.Parts.Engine.Engine;
import Car.Parts.Engine.ICE;

public class HybridCar extends Car{
    private Electric secondEngine;

    public HybridCar(ICE engine, Electric secondEngine, String tyres, String colour, double price) {
        super(engine,tyres,colour,price);
        this.secondEngine = secondEngine;
    }
}
