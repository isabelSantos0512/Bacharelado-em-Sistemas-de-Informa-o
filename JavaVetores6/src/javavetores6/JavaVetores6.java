/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javavetores6;

import javax.swing.JOptionPane;


public class JavaVetores6 {

    
    public static void main(String[] args) {
           // QUESTÃO 6
    //criar um vetor real de 20 posições
    //as 10 primeiras são informados pelo usuário
    //e as dez segunites são os mesmos números em ordem inversa
     
    double[] valores = new double[20];
    int num=0;
    
    for(int i=0; i<10; i++){
        valores[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"DIGITE UM VALOR: "));
        
    }
    for(int i=19;i>9;i--){
       
       valores[i]=valores[num];
        num++;
        
    }
    for(int i=0;i<=19;i++){
        System.out.println(valores[i]);
        
    }
    }
    
}
