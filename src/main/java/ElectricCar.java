public class ElectricCar extends Vehicle {
    
    private double chargingTime;
    private int chargeLevel;
    
    ElectricCar electricCar;
    
    
    public ElectricCar(Engine engine, Wheels wheels, Doors doors, Seats seats, String colour, double price, double chargingTime, int chargeLevel) {
        super(engine, wheels, doors, seats, colour, price);
        this.chargeLevel = chargeLevel;
        this.chargingTime = chargingTime;
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
