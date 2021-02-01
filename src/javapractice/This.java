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
class Box1{
    private int l, b, h;
    public void setDimension(int l,int b,int h)
    { this.l=l; this.b=b; this.h=h; }
    public void getDimension(){
        System.out.println("Length : "+l+" Breadth : "+b+" Height : "+h);
    }
}

public class This {
    public static void main(String[] args){
        Box1 b1 = new Box1();
        b1.setDimension(12,10,5);
        b1.getDimension();
    }
}
