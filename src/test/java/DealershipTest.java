import org.junit.Before;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Doors doors;
    Engine engine;
    Seats seats;
    Wheels wheels;
    ElectricCar electricCar;
    SportsCar sportsCar;
    ArrayList<Vehicle> listOfCars;

    @Before
    public void before(){
        doors = new Doors(4, true);
        engine = new Engine(2.0, 1000);
        seats = new Seats(4, "leather");
        wheels = new Wheels(4, WheelType.SUMMER);

        electricCar = new ElectricCar(engine, wheels, doors,seats, "Red",20000, 2.5);

        sportsCar = new SportsCar(engine, wheels, doors,seats, "Red",20000, true);

        listOfCars = new ArrayList<>();

        listOfCars.add(electricCar);
        listOfCars.add(sportsCar);

        dealership = new Dealership(listOfCars, 100000.00);
    }

    @Test
    public void hasListOfVehiclesOnSale(){
        assertEquals(2, dealership.getVehiclesOnSale().size());
    }

    @Test
    public void hasTill(){
        assertEquals(100000, dealership.getTill(), 0.00);
    }

}
