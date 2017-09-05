/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficha5;

import javax.swing.JOptionPane;

/**
 *
 * @author Junior
 */
public class Exercicio1 {
    
    public static String calcBin(int num){
        
        if (num==0)
            return "";
        return calcBin (num/2)+ num%2;
        
    }
    
     public static void main (String [] args){
        int valor;
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("digite o valor a converter"));
        JOptionPane.showMessageDialog(null, calcBin(valor));
        
    }
}
    

