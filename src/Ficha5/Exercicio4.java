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
public class Exercicio4 {
    
    public static int contador(String nr,int indice, int digito, String n, int num){
        
        
     n = ""+nr.charAt(indice);
     
     num = Integer.parseInt(n);
     
     if (num==digito){
         if(indice ==0)
            return 1;
         return 1+contador(nr, (indice-1), digito, n , num);
     }
    
      
     if(indice ==0)
            return 0;  
      return contador(nr, (indice-1), digito, n , num); 
    }
    
    public static void main(String[] args) {
        String nr, n;
        int indice,  num, digito;
        
        nr = JOptionPane.showInputDialog(null, "digite o numero");
        digito = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o valor"));
        
        n="";
        indice = nr.length()-1;
        num=0;
        
        //System.out.println(contador(nr, indice, digito, n, num));
        JOptionPane.showMessageDialog(null, contador(nr, indice, digito, n, num));
    }
    
}
