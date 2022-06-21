public class Engine {
    
    private double size;
    private int litres;
    private boolean engineOn;
    
    public Engine(double size, int litres) {
        this.size = size;
        this.litres = litres;
    }
    
    public double getSize() {
        return size;
    }
    
    public int getLitres() {
        return litres;
    }
    
    public void startEngine(){
        engineOn = true;
    }
    
    public void stopEngine(){
        engineOn = false;
    }
    
    public boolean getEngineOn(){
        return this.engineOn;
    }
}
