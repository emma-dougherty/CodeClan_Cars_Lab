public class Wheels {
    
    private int number;
    private WheelType wheelType;
    
    public Wheels(int number, WheelType wheelType) {
        this.number = number;
        this.wheelType = wheelType;
    }
    
    public int getNumber() {
        return number;
    }
    
    public WheelType getWheelType() {
        return wheelType;
    }
}
