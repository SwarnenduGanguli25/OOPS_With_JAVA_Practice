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
class Parent{
    public static void f1(){
        System.out.println("Hello, this is static member function.\n");
    } 
}

class Child extends Parent{
    
}

public class SMFInheritance {
    public static void main(String[] args){
        Child.f1();
    }
}
