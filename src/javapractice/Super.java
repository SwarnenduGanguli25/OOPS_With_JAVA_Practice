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
class P{
    public void f1(){
        System.out.println("Class P");
    }
}

class Q extends P{
    public void f1(){
        super.f1();
        System.out.println("Class Q");
    }
}

public class Super {
    public static void main(String[] args){
        Q obj = new Q();
        obj.f1();
    }
}
