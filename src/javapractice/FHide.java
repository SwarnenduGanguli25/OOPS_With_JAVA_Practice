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
class Parent1{
    public static void f1(){
        System.out.println("Hello, this is static member function of parent class.\n");
    } 
}

class Child1 extends Parent1{
    public static void f1(){
        System.out.println("Hello, this is static member function of child class.\n");
    } 
}

public class FHide {
    public static void main(String[] args){
        Child1.f1();
    }
}
