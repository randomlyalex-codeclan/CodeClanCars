import Behaviours.IBuy;
import Behaviours.ISell;
import Car.Car;

import java.util.ArrayList;

public class Customer implements ISell, IBuy {

    private String name;
    private  double wallet;
    private ArrayList<Car> ownedCars;

    public Customer(String name){
        this.name = name;
        this.wallet = 0;
        this.ownedCars = new ArrayList<Car>();
    }

    public Customer(String name, double startingMoney){
        this.name = name;
        this.wallet = startingMoney;
        this.ownedCars = new ArrayList<Car>();
    }


    public ArrayList<Car> getOwnedCars() {
        return this.ownedCars;
    }
}
