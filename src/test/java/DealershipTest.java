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
    Customer customer;

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

        customer = new Customer(30000.00);

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

    @Test
    public void canSellCar(){
        Vehicle carToSell = dealership.getVehiclesOnSale().get(0);
        dealership.sellCar(carToSell, customer);
        assertEquals(1, dealership.getVehiclesOnSale().size());
        assertEquals(120000.00, dealership.getTill(), 0.00);
        assertEquals(10000, customer.getMoney(), 0.00);
        assertEquals(1, customer.getOwnedVehicles().size());

    }

}
