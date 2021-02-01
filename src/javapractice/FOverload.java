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
class A{
    public void f1(int x){
        System.out.println("Class A");
    }
}

class B extends A{
    public void f1(int x,int y){
        System.out.println("Class B");
    }
}

public class FOverload {
    public static void main(String[] args){
        B obj = new B();
        obj.f1(5);
        obj.f1(3,4);
    }
}
