import Lab1.Volvo240;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class Lab1Test {

     @Test
     void volvoSpeedFactor()   {
         Volvo240 set = new Volvo240();
         set.speedFactor();
         assertEquals(1.25, set.speedFactor());

     }
}




