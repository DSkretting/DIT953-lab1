package Lab1;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.*;
import java.util.List;
import java.lang.Math;


public abstract class Car implements Movable {
    Scanner in = new Scanner(System.in);
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    protected double yCoordinates;
    protected double xCoordinates;
    protected Point2D[] turnList;
    protected String i;
    protected int angle;
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

    public void inputPanel() {
        while (!Objects.equals(i, "q")) {
            i = in.next();
            switch (i) {
                case "w" -> move();
                case "d" -> turnLeft();
                case "a" -> turnRight();
                case "s" -> stopEngine();

            }
        }
    }

    public void move() {
        currentx = xCoordinates;
        currenty = yCoordinates;
        xCoordinates = currentSpeed * (currentx * Math.cos(angle) - currenty * Math.sin(angle));
        yCoordinates = currentSpeed * (currentx * Math.sin(angle) - currenty * Math.cos(angle));
        System.out.println(xCoordinates);
        System.out.println(yCoordinates);
    }

    public void turnLeft() {
        if (angle != 0) {
            angle -= 1;
        } else {
            angle = 359;
        }
    }

    public void turnRight() {
        if (angle != 359) {
            angle += 1;
        } else {
            angle = 0;
        }
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
