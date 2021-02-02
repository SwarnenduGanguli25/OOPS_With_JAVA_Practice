/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author Hp
 */
class Parent2{
    static int y=4;
}

class Child2 extends Parent2{
    static{
        y = 5;
    }
}

public class SMVInheritance {
    public static void main(String[] args){
        System.out.println("y = "+Child2.y);
    }
}
