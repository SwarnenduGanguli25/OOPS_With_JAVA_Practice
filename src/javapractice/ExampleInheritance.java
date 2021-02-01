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
public class ExampleInheritance {
    public static void main(String[] args){
        StudentInheritance s1 = new StudentInheritance();
        s1.setRollno(68);
        s1.setName("Swarnendu");
        s1.setAge(20);
        System.out.println("Roll No: "+ s1.getRollno());
        System.out.println("Name: "+ s1.getName());
        System.out.println("Age: "+ s1.getAge());
    }
}
