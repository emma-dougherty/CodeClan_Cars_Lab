import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(double money) {
        this.money = money;
        ownedVehicles = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void addCarToOwnedVehicles(Vehicle vehicle){
        ownedVehicles.add(vehicle);
    }
}
