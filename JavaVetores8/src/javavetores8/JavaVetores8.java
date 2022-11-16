/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javavetores8;

import javax.swing.JOptionPane;


public class JavaVetores8 {

   
    public static void main(String[] args) {
          //QUESTÃO 8
        //Criar dois vetores de 30 posicoes
        double[] vetor=new double[30];
        double[] vetor1 =new double[30];
        double[] vetor2= new double[30];
        
        for(int i=0;i<30;i++){
        vetor[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número: "));
        vetor1[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um outro número: "));
        
        // testando e armazenado os valores no 3 vetor
        if(vetor[i]==vetor1[i]){
            vetor2[i]=i;
           vetor2 [i]=1;
           
        }
       else{
            vetor2[i]=0;
        }
        }
        //Mostrar os valores
        for(int i=0; i<30;i++){
            
             System.out.println(vetor2[i]);
            
        }
    }
    
}
