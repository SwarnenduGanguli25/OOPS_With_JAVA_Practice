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

class Box
{
    private int length,breadth,height;
    public void setDimension(int l,int b,int h)
    {
        length=l; breadth=b; height=h;
    }
    public void showDimension()
    {
        System.out.println("L="+length);
        System.out.println("B="+breadth);
        System.out.println("H="+height);
    }
}


public class BoxExample {
    public static void main(String[] args)
    {
        Box smallBox = new Box();
        smallBox.setDimension(15,10,8);
        smallBox.showDimension();
        smallBox = new Box();
        smallBox.showDimension();
    }
}
