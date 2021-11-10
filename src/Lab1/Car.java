package Lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.geom.Point2D;
import java.util.*;
import java.util.List;
import java.lang.Math;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;


public abstract class Car implements Movable{
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    protected double yCoordinates;
    protected double xCoordinates;
    protected Point2D[] turnList;
    protected String i;
    protected double angle;
    protected double currentx;
    protected double currenty;


    protected Car(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed, double xCoordinates, double yCoordinates, int angle) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.currentSpeed = currentSpeed;
        this.yCoordinates = yCoordinates;
        this.xCoordinates = xCoordinates;
        /*this.turnList = new Point2D[]{
                new Point2D.Double(xCoordinates, yCoordinates+currentSpeed),
                new Point2D.Double(xCoordinates+currentSpeed, yCoordinates),
                new Point2D.Double(xCoordinates, yCoordinates-currentSpeed),
                new Point2D.Double(xCoordinates-currentSpeed, yCoordinates)};*/
        this.angle = angle;
    }

    public void move() {
        while (true) {
            currentx = xCoordinates;
            currenty = yCoordinates;
            xCoordinates = currentx + (currentSpeed * Math.sin(angle));
            yCoordinates = currenty + (currentSpeed * Math.cos(angle));
            System.out.println(xCoordinates);
            System.out.println(yCoordinates);
        }
    }

    public void turnLeft() {
        angle -= 1 / (2 * Math.PI);
    }

    public void turnRight() {
        angle += 1 / (2 * Math.PI);
    }


    protected int getNrDoors() {
        return nrDoors;
    }

    protected double getEnginePower() {
        return enginePower;
    }

    protected double getCurrentSpeed() {
        return currentSpeed;
    }

    protected Color getColor() {
        return color;
    }

    protected void setColor(Color clr) {
        color = clr;
    }

    protected void startEngine() {
        currentSpeed = 0.1;
    }

    protected void stopEngine() {
        currentSpeed = 0;
    }

    abstract public double speedFactor();

    abstract protected void incrementSpeed(double amount);

    abstract protected void decrementSpeed(double amount);

}