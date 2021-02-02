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
class Box2{
    private int l,b,h;
    public Box2(){
        l=10; b=8; h=4;
        System.out.println("Non-parameterized constructor called : L="+l+" B="+b+" H="+h+"\n");
    }
    public Box2(int L,int B,int H){
        l=L; b=B; h=H;
        System.out.println("Parameterized constructor called : L="+l+" B="+b+" H="+h+"\n");
    }
}

public class ConstructorOverload {
    public static void main(String[] args){
        Box2 obj1 = new Box2();
        Box2 obj2 = new Box2(15,10,5);
    }
}
