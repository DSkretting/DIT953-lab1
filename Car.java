import java.awt.*;
import java.awt.geom.Point2D;
import java.util.*;
import java.util.List;


public abstract class Car {
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

    protected Car(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed, double xCoordinates, double yCoordinates){
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.currentSpeed = currentSpeed;
        this.yCoordinates = yCoordinates;
        this.xCoordinates = xCoordinates;
        this.turnList = new Point2D[]{
                new Point2D.Double(xCoordinates, yCoordinates+currentSpeed),
                new Point2D.Double(xCoordinates+currentSpeed, yCoordinates),
                new Point2D.Double(xCoordinates, yCoordinates-currentSpeed),
                new Point2D.Double(xCoordinates-currentSpeed, yCoordinates)};

    }

    protected void inputPanel() {
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

//    protected Point2D inputPanel(){
//        while (!Objects.equals(i, "q")) {
//            i = in.next();
//            if (Object.equals(i, "w")){
//                move();
//            }
//            else if (Object.equals(i, "d")){
//                turnLeft();
//            }
//            else if (Object.equals(i, "a")){
//            }
//            else if (Object.equals(i, "s")){
//            }
//
//        }
//    }
    protected void move(){

    }

    protected void turnLeft(){
    }

    protected void turnRight(){
    }
    protected int getNrDoors(){
        return nrDoors;
    }
    protected double getEnginePower(){
        return enginePower;
    }

    protected double getCurrentSpeed(){
        return currentSpeed;
    }

    protected Color getColor(){
        return color;
    }

    protected void setColor(Color clr){
        color = clr;
    }

    protected void startEngine(){
        currentSpeed = 0.1;
    }

    protected void stopEngine(){
        currentSpeed = 0;
    }
    abstract public double speedFactor();

    abstract protected void incrementSpeed(double amount);

    abstract protected void decrementSpeed(double amount);

}
