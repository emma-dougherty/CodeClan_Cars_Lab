
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SportsCarTest {
    
    SportsCar sportsCar;
    Engine engine;
    Doors doors;
    Seats seats;
    Wheels wheels;
    
    @Before
    public void before() {
        doors = new Doors(4, true);
        engine = new Engine(2.0, 1000);
        seats = new Seats(4, "leather");
        wheels = new Wheels(4, WheelType.SUMMER);
        sportsCar = new SportsCar(engine, wheels, doors,seats, "Red",20000, true);
    }
    
    @Test
    public void hasEngine(){
        assertNotNull(sportsCar.getEngine());
    }
    
    @Test
    public void hasDoors(){
        assertNotNull(sportsCar.getDoors());
    }
    
    @Test
    public void hasWheels(){
        assertNotNull(sportsCar.getWheels());
    }
    
    @Test
    public void hasSeats(){
        assertNotNull(sportsCar.getSeats());
    }
    
    @Test
    public void hasColour(){
        assertEquals("Red",sportsCar.getColour());
    }
    
    @Test
    public void hasPrice(){
        assertEquals(20000,sportsCar.getPrice(),0.00);
    }
    
    @Test
    public void isConvertible(){
        assertEquals(true,sportsCar.isCovertible());
    }
    
    @Test
    public void canStart(){
        assertEquals("Car has started", sportsCar.startCar());
    }
    
    @Test
    public void canStop(){
        assertEquals("Car has stopped", sportsCar.stopCar());
    }
}
