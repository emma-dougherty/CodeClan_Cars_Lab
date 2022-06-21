import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WheelsTest {
    
    Wheels wheels;
    
    @Before
    public void before(){
        wheels = new Wheels(4, WheelType.SUMMER);
    }
    
    @Test
    public void hasNumber(){
        assertEquals(4, wheels.getNumber());
    }
    
    @Test
    public void hasType(){
        assertEquals(WheelType.SUMMER, wheels.getWheelType());
    }
}
