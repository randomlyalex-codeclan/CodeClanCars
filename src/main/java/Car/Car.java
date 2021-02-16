package Car;

import Car.Parts.Engine.Engine;

public abstract class Car {
    private Engine engine;
    private String tyres;
    private String colour;
    private double price;

    public Car(Engine engine, String tyres, String colour, double price){
        this.engine = engine;
        this.tyres = tyres;
        this.colour= colour;
        this.price = price;

    }

    public double getPrice(){
        return this.price;
    }
}
