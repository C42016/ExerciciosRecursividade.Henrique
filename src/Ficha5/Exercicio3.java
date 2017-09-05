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
public class Exercicio3 {
    
    public static int soma(String valor, int indice, int a, String b){
   
       
        if (indice==0)
            return a;
        
        
        
    b = ""+valor.charAt(indice);
    
    a = Integer.parseInt(b);
    
    
        
    
    
    return a+soma(valor, indice-1, a, b);
    }
    
    public static void main(String[] args) {
        String valor, b;
        int indice, a;
        
        valor = JOptionPane.showInputDialog("digite o valor");
        b="";
        indice = valor.length() - 1;
        a=0;
        
       JOptionPane.showMessageDialog(null, soma(valor, indice, a, b));
        
        
    }
    
    
    
}
