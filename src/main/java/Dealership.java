import Behaviours.IBuy;
import Car.Car;

import java.util.ArrayList;

public class Dealership implements IBuy {

    private String name;
    private ArrayList<Car> carStock;
    private double till;

    public Dealership(String name, double till){
        this.name = name;
        this.till = till;
        this.carStock = new ArrayList<Car>();
    }


    public void buyCar(Car car, Customer customer) {
        if (this.till > car.getPrice()) {
            customer.getOwnedCars().remove(car);
            this.carStock.add(car);
        }
    }

}
