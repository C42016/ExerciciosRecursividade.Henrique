/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficha5;

/**
 *
 * @author Junior
 */
public class Exercicio2 {
    
    public static int multiply(int a, int b){
           
        if (a==1){
           return b;
        }
        
            
        return b+multiply(a-1, b);
}
     
    
    public static void main(String[] args) {
        System.out.println(multiply(3, 3));
    }
}
