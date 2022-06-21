import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoorsTest {
    
    Doors doors;
    
    @Before
    public void before(){
        doors = new Doors(4, true);
    }
    
    @Test
    public void hasElectricWindows(){
        assertEquals(true, doors.isElectricWindows());
    }
    
}
