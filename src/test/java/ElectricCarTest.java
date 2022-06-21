import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ElectricCarTest {

    ElectricCar electricCar;
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
        electricCar = new ElectricCar(engine, wheels, doors,seats, "Red",20000, 2.5);
    }

    @Test
    public void hasEngine(){
        assertNotNull(electricCar.getEngine());
    }

    @Test
    public void hasDoors(){
        assertNotNull(electricCar.getDoors());
    }

    @Test
    public void hasWheels(){
        assertNotNull(electricCar.getWheels());
    }

    @Test
    public void hasSeats(){
        assertNotNull(electricCar.getSeats());
    }

    @Test
    public void hasColour(){
        assertEquals("Red",electricCar.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(20000,electricCar.getPrice(),0.00);
    }

    @Test
    public void canStart(){
        assertEquals("Car has started", electricCar.startCar());
    }

    @Test
    public void canStop(){
        assertEquals("Car has stopped", electricCar.stopCar());
    }

    @Test
    public void hasChargingTime(){
        assertEquals(2.5, electricCar.getChargingTime(), 0.00);
    }

    @Test
    public void hasChargeLevel(){
        assertEquals(100, electricCar.getChargeLevel());
    }

}
