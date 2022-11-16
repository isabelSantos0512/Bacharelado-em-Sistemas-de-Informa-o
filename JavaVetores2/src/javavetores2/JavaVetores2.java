/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javavetores2;

import javax.swing.JOptionPane;


public class JavaVetores2 {

    
    public static void main(String[] args) {
        //Questão vetores
           //Ler 20 números inteiros 
       // imprimir em ordem inversa.
       
       int[] num = new int[20];
       int contaTudo = 19;
       
       for(int i=0; i<20;i++){
         num[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE UM NÚMERO:" )) ;
        
       } 
      //Imprimir em ordem inversa. 
    while(contaTudo!=-1){
        System.out.println(num[contaTudo]);
        contaTudo--;
        
    } 
    }
    
}
