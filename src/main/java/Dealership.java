import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> vehiclesOnSale;
    private double till;

    public Dealership(ArrayList<Vehicle> vehiclesOnSale, double till) {
        this.vehiclesOnSale = vehiclesOnSale;
        this.till = till;
    }

    public ArrayList<Vehicle> getVehiclesOnSale() {
        return vehiclesOnSale;
    }

    public double getTill() {
        return till;
    }
}
