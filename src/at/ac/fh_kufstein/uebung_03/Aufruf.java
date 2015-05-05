/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03;

import at.ac.fh_kufstein.uebung_03.Classes.Benennbar;
import at.ac.fh_kufstein.uebung_03.Classes.Boat;
import at.ac.fh_kufstein.uebung_03.Classes.Car;
import at.ac.fh_kufstein.uebung_03.Classes.CarAbstract;
import at.ac.fh_kufstein.uebung_03.Classes.Color;
import at.ac.fh_kufstein.uebung_03.Classes.Liste;

/**
 *
 * @author Hannes
 */
public class Aufruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Car bmw = new Car((short)4, (short)4, Color.SILVER, (short)220, (short)5);
        Car audi = new Car((short)8, (short)4, Color.BLACK, (short)180, (short)5);
        Boat titanic = new Boat(10.54, (short)3, 100000, (short)0, Color.BLUE, (short)51000, (short)0);
        
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println(titanic.toString());
        
        Benennbar namedCar = new Car((short)4, (short)4, Color.BLACK, (short)300, (short)3);
        namedCar.setName("Prototyp");
        System.out.println(namedCar.getName());
        
        
        CarAbstract carNamed = new CarAbstract((short)4, (short)4, Color.BLUE, (short)150, (short)5);
        carNamed.setName("Prototyp2");
        System.out.println(carNamed.getName());
        
        
        
//        Liste<Double> stack = new Liste(10);
//        stack.push(2.0);
//        stack.push(5.0);
//        stack.push(200.0);
//        
//        while(!stack.isEmpty())
//        {
//            System.out.println(stack.pop());
//        }
        
        Liste<CarAbstract> stack = new Liste(10);
        stack.push(new CarAbstract((short)4, (short)4, Color.BLACK, (short)200, (short)3));
        stack.push(new CarAbstract((short)2, (short)4, Color.GREY, (short)60, (short)3));
        
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
        
    }
    
}
