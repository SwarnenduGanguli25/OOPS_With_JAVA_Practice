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
class A2{
    int a;
    public A2(int x){
        a=x;
        System.out.println(a);
    }
}

class B2 extends A2{
    int b;
    public B2(){
        super(4);
        System.out.println("B");
    }
}

public class ConstructorInheritance2 {
    public static void main(String[] args){
        B2 obj = new B2();
    }
}
