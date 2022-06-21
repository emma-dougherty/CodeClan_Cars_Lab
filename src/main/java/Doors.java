public class Doors {
    
    private int numDoors;
    private boolean electricWindows;
    
    public Doors(int numDoors, boolean electricWindows) {
        this.numDoors = numDoors;
        this.electricWindows = electricWindows;
    }
    
    public int getNumDoors() {
        return numDoors;
    }
    
    public boolean isElectricWindows() {
        return electricWindows;
    }
}
