/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03.Classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Hannes
 */
public class CarAbstract extends VehicleAbstract
{
    private boolean aircondition;
    private short airbag;
    
    public void startAircondition()
    {
        if(aircondition == false)
        {
            aircondition = true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Klimaanlage läuft bereits!");
        }
    }
    
    public void stopAircondition()
    {
        if(aircondition==true)
        {
            aircondition = false;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Klimaanlage bereits aus!");
        }
    }

    public CarAbstract(short airbag, short wheels, Color color, short ps, short doors) {
        super(wheels, color, ps, doors, false, (short)0);
        this.aircondition = false;
        this.airbag = airbag;
    }
    
    @Override
    public String toString() 
    {
        return("Mein Auto hat "+this.getPs()+" PS und fährt mit "+this.getSpeed()+" km/h.");
    }

    
    public String FName;
    
    @Override
    public void setName(String name) {
        FName = name;
    }

    @Override
    public String getName() {
        return FName;
    }
    
    
}
