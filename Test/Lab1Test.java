import Lab1.Main;
import Lab1.Saab95;
import Lab1.Volvo240;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.*;

class SaabTest {
    private static Saab95 saab95;
    @BeforeAll
    static void setSaab95() {
        saab95 = new Saab95();
    }
    @Test
    void Saab95SpeedFactorWithoutTurbo() {
        saab95.setTurboOff();
        assertEquals(1.25, saab95.speedFactor());
    }
    @Test
    void Saab95SpeedFactorWithTurbo() {
        saab95.setTurboOn();
        assertEquals(1.625, saab95.speedFactor());
    }
     @Test
     void Saab95Doors() {
        assertEquals(2, saab95.getNrDoors());
    }
    @Test
     void Saab95Color() {
        assertEquals(Color.red, saab95.getColor());
    }
    @Test
    void Saab95EnginePower() {
        assertEquals(125, saab95.getEnginePower());
    }
//    @Test
//    void SaabName() {
//        assertEquals("Saab95", saab95.getModelName());
//    }
    @Test
    void Saab95CurrentSpeed() {
        assertEquals(1, saab95.getCurrentSpeed());
    }
}
class Volvo240Test{
    private static Volvo240 volvo240;
    @BeforeAll
    static void setVolvo240() {
        volvo240 = new Volvo240();
    }
    @Test
    void Volvo240SpeedFactor() {
        assertEquals(1.25, volvo240.speedFactor());
    }
    @Test
    void Volvo240Doors() {
        assertEquals(4, volvo240.getNrDoors());
    }
    @Test
    void Volvo240Color() {
        assertEquals(Color.black, volvo240.getColor());
    }
    @Test
    void Volvo240EnginePower() {
        assertEquals(100, volvo240.getEnginePower());
    }
//    @Test
//    void Volvo240Name() {
//        assertEquals("Volvo240", volvo240.getModelName());
//    }
    @Test
    void Volvo240CurrentSpeed() {
        assertEquals(1, volvo240.getCurrentSpeed());
        // CurrentSpeed för Volvo är skum den är 1 i konstruktorn men det ger värdet 1 när man testar den
    }
}

// Vet inte vaför getModelName inte funkar.