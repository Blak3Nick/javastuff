package com.example.helloworld;

/**
 * Created by Cyr1lfiggus1 on 11/28/2016.
 */
public class Vehicle implements JavaLessonFifteen.Drivable{

    int numOfWheels = 2;

    double theSpeed = 0;

    int carStrength = 0;

    public int getWheel(){
        return this.numOfWheels;
    }

    public void setWheels(int numWheels){
        this.numOfWheels = numWheels;
    }

    public double getSpeed(){
        return this.theSpeed;
    }

    public void setSpeed(double speed){
        this.theSpeed = speed;

    }

    public Vehicle(int wheels, double speed){
        this.numOfWheels = wheels;
        this.theSpeed = speed;
    }

}
