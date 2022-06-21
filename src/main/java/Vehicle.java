public abstract class Vehicle {
    
    private Engine engine;
    private Wheels wheels;
    private Doors doors;
    private Seats seats;
    private String colour;
    private double price;
    
    public Vehicle(Engine engine, Wheels wheels, Doors doors, Seats seats, String colour, double price) {
        this.engine = engine;
        this.wheels = wheels;
        this.doors = doors;
        this.seats = seats;
        this.colour = colour;
        this.price = price;
    }
    
    public Engine getEngine() {
        return engine;
    }
    
    public Wheels getWheels() {
        return wheels;
    }
    
    public Doors getDoors() {
        return doors;
    }
    
    public Seats getSeats() {
        return seats;
    }
    
    public String getColour() {
        return colour;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String startCar(){
        engine.startEngine();
        return "Car has started";
    }
    
    public String stopCar(){
        engine.stopEngine();
        return "Car has stopped";
    }
}
