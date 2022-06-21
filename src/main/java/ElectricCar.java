public class ElectricCar extends Vehicle {
    
    private double chargingTime;
    private int chargeLevel;
    
    ElectricCar electricCar;
    
    
    public ElectricCar(Engine engine, Wheels wheels, Doors doors, Seats seats, String colour, double price, double chargingTime) {
        super(engine, wheels, doors, seats, colour, price);
        this.chargingTime = chargingTime;
        this.chargeLevel = 100;
    }
    
    public double getChargingTime() {
        return chargingTime;
    }
    
    public int getChargeLevel() {
        return chargeLevel;
    }
    
    public ElectricCar getElectricCar() {
        return electricCar;
    }
}
