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
class A3{
    int a;
    public A3(){
        System.out.println("A 1");
    }
}

class B3 extends A3{
    int b;
    public B3(){
        this(5);
        System.out.println("B 1");
    }
    
    public B3(int x){
        //this();
        System.out.println("B 2");
    }
}

public class ConstructorChaining {
    public static void main(String[] args){
        B3 obj = new B3();
    }
}
