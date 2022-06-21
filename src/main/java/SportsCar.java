public class SportsCar extends Vehicle {
    
    private boolean covertible;
    
    public SportsCar(Engine engine, Wheels wheels, Doors doors, Seats seats, String colour, double price, boolean convertible) {
        super(engine, wheels, doors, seats, colour, price);
        this.covertible = convertible;
    }
    
    
    public boolean isCovertible() {
        return covertible;
    }
}
