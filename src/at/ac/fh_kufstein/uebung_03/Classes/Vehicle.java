/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03.Classes;

/**
 *
 * @author Hannes
 */
public class Vehicle 
{
    private short wheels;
    private Color color;
    private short ps;
    private short doors;
    private boolean started;
    private short speed;
    
    public void start()
    {
        started = true;
    }
    
    public void stop()
    {
        started = false;
    }
    
    public void accelerate(short speed)
    {
        this.speed += this.speed + speed;
    }
    
    public void breeak(short speed)
    {
        if(this.started == true)
        {
            this.speed -= this.speed - speed;
            if(this.speed < 0)
            {
                this.speed = 0;
            }
        }
    }

    public short getWheels() {
        return wheels;
    }

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getDoors() {
        return doors;
    }

    public void setDoors(short doors) {
        this.doors = doors;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public Vehicle(short wheels, Color color, short ps, short doors, boolean started, short speed) {
        this.wheels = wheels;
        this.color = color;
        this.ps = ps;
        this.doors = doors;
        this.started = started;
        this.speed = speed;
    }

    

    
    
    
}
