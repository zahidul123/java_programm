/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacherassistent;

/**
 *
 * @author Destroy
 */
public class Cat extends Animal {
    public static String name="pussy";
    public static void main(String[]args){
        System.out.println(name);
        Cat ct=new Cat();
        ct.setLeg("sumon");
        System.out.println(ct.getLeg());
        
    }
    
}
