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
public class Student {
    private int rollno;
    private String name;
    public void setRollno(int r)
    {
        rollno=r;
    }
    public void setName(String n)
    {
        name=n;
    }
    public int getRollno(){
        return(rollno);
    }
    public String getName(){
        return(name);
    }
}
