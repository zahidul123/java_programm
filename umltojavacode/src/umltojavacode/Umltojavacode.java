/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umltojavacode;

/**
 *
 * @author Destroy
 */
public class Umltojavacode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("creating all object ");
        FireMonster fm=new FireMonster();
        StoneMonster sm=new StoneMonster();
        WaterMonster wm=new WaterMonster();
        System.out.println(fm.FireMonster("Sumon"));
        fm.specialPower();
    }
    
}
