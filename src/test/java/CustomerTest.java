import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    ElectricCar electricCar;
    Engine engine;
    Doors doors;
    Seats seats;
    Wheels wheels;


    @Before
    public void before() {
        customer = new Customer(30000.00);
        doors = new Doors(4, true);
        engine = new Engine(2.0, 1000);
        seats = new Seats(4, "leather");
        wheels = new Wheels(4, WheelType.SUMMER);
        electricCar = new ElectricCar(engine, wheels, doors,seats, "Red",20000, 2.5);
    }

    @Test
    public void hasMoney(){
        assertEquals(30000.00, customer.getMoney(),00);
    }

    @Test
    public void hasEmptyOwnedCarsArray(){
        assertEquals(0, customer.getOwnedVehicles().size());
    }

    @Test
    public void canAddVehicleToOwnedVehicles(){
        customer.addCarToOwnedVehicles(electricCar);
        assertEquals(1, customer.getOwnedVehicles().size());
    }

    @Test
    public void canBuyVehicle(){
        customer.buyCar(electricCar);
        assertEquals(1, customer.getOwnedVehicles().size());
        assertEquals(10000.00, customer.getMoney(), 0.00);
    }
}
