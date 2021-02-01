/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;
import javapractice.Student;
/**
 *
 * @author Hp
 */
public class Example {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setRollno(100);
        s1.setName("Swarnendu");
        System.out.println("Roll no: "+ s1.getRollno());
        System.out.println("Name: "+ s1.getName());
    }
}
