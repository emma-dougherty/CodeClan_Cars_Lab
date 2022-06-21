import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeatsTest {
    
    Seats seats;
    
    @Before
    public void before(){
        seats = new Seats(4, "leather");
    }
    
    @Test
    public void hasNumber(){
        assertEquals(4, seats.getNumSeats());
    }
    
    @Test
    public void hasMaterial(){
        assertEquals("leather", seats.getMaterial());
    }
}
