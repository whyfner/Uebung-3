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
public class Liste<type extends VehicleAbstract>
{
    private type[] elemente;
    public int zähler;
    
    public Liste(int size)
    {
        zähler = 0;
        elemente = (type[]) new VehicleAbstract[size];
    }
    
    public void push(type element)
    {
        if(zähler<elemente.length)
        {
            elemente[zähler]=element;
            zähler++;
        }
    }
    
    
    public type pop()
    {
        type variable = null;
        if(zähler>0)
        {
            variable=elemente[zähler-1];
            elemente[zähler-1]=null;
            zähler--;
        }
        return variable;
    }
    
    public boolean isEmpty()
    {
        if(zähler==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
