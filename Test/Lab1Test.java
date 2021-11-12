import Lab1.Main;
import Lab1.Saab95;
import Lab1.Volvo240;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.*;

class Lab1Test {
    private static Saab95 saab95;

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
     @Test
     void SaabDoors() {
        saab95 = new Saab95();
        assertEquals(2, saab95.getNrDoors());
    }
    @Test
     void SaabColor() {
        saab95 = new Saab95();
        assertEquals(Color.red, saab95.getColor());
    }
    @Test
    void SaabEnginePower() {
        saab95 = new Saab95();
        assertEquals(125, saab95.getEnginePower());
    }
//    @Test
//    void SaabName() {
//        saab95 = new Saab95();
//        assertEquals("Saab95", saab95.getModelName());
//    }
    @Test
    void SaabCurrentSpeed() {
        saab95 = new Saab95();
        assertEquals(1, saab95.getCurrentSpeed());
    }
}

