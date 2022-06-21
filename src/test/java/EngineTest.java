import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    
    Engine engine;
    
    @Before
    public void before(){
        engine = new Engine(2.0, 1000);
    }
    
    @Test
    public void hasSize(){
        assertEquals(2.0, engine.getSize(), 0.00);
    }
    
    @Test
    public void hasLitres(){
        assertEquals(1000, engine.getLitres());
    }
    
    @Test
    public void canStart(){
        engine.startEngine();
        assertEquals(true, engine.getEngineOn());
    }
    
    @Test
    public void canStop(){
        engine.stopEngine();
        assertEquals(false, engine.getEngineOn());
    }
}
