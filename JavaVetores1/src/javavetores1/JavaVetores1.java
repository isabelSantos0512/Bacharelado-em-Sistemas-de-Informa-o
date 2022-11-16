/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javavetores1;

import javax.swing.JOptionPane;

public class JavaVetores1 {

    
    public static void main(String[] args) {
        //questão de vetores 1
           //Um vetor de 30 posicoes 
     //cada posicao correspode a quadrado de sua posiçao
     //imprima depois o vetor resultante
     
     int[] vetor = new int [30];
     
     for(int i=0;i<=vetor.length;i++){
         vetor[i]=i*i; 
         
       JOptionPane.showMessageDialog(null, vetor[i]);
    }
    }
    
}
