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
class X{
    public void f1(int x){
        System.out.println("Class X");
    }
}

class Y extends X{
    public void f1(int x){
        System.out.println("Class Y");
    }
}

public class FOverride {
    public static void main(String[] args){
        Y obj = new Y();
        obj.f1(5);
    }
}
