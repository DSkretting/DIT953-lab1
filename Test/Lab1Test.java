import Lab1.Saab95;
import Lab1.Volvo240;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Lab1Test {
    @Test
    void saab_speedfactor_without_turbo() {
        Saab95 set = new Saab95();
        set.setTurboOff();
        set.speedFactor();
        assertEquals(1.25, set.speedFactor());
    }
    @Test
    void saab_speedfactor_with_turbo() {
        Saab95 set = new Saab95();
        set.setTurboOn();
        set.speedFactor();
        assertEquals(1.625, set.speedFactor());

    }

     @Test
     void volvoSpeedFactor()   {
         Volvo240 set = new Volvo240();
         set.speedFactor();
         assertEquals(1.25, set.speedFactor());

     }
}

