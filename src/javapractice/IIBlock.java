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
public class IIBlock {
    private int x;
    {
        System.out.println("Initialization Block: "+x);
        x=5;
    }
    
    public IIBlock(){
        System.out.println("Constructor: "+x);
    }
    
    public static void main(String[] args){
        IIBlock t1 = new IIBlock();
        IIBlock t2 = new IIBlock();
    }
}
