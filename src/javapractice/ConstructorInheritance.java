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
class A1{
    int a;
    public A1(){
        System.out.println("A");
    }
}

class B1 extends A1{
    int b;
    public B1(){
        System.out.println("B");
    }
}
public class ConstructorInheritance {
    public static void main(String[] args){
        B1 obj = new B1();
    }
}
