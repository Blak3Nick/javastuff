package com.example.helloworld;

/**
 * Created by Cyr1lfiggus1 on 11/28/2016.
 */
public abstract class Crashable {
    boolean carDrivable = true;

    public void youCrashed(){
        this.carDrivable = false;
    }

    public abstract void setCarStrength(int carStrength);

    public abstract int getCarStrength();

}
