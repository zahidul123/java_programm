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
public class FireMonster extends Monstar implements Power {
    public String FireMonster(String FireMonster){
        return FireMonster;
    }

    @Override
    public void specialPower() {
        System.out.println("i am override in fire monstar class");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
