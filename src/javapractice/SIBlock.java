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
public class SIBlock {
    private static int k;
    static{
        System.out.println("Static Initialization Block: "+k);
        k=10;
    }
    
    public static void main(String[] args){
        new SIBlock();
    }
}
