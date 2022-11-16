/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javarepetição23;

import javax.swing.JOptionPane;


public class JavaRepetição23 {

    
    public static void main(String[] args) {
        //Questão 23
     //armazenar os valores
    //testar os intervalos, quantos acertaram de (0 a 25), de 26 a 50, de 51 a 75, de 7 a 100.
    // A entrada de dados deve terminar quando for lido um numero negativo.
    // mostrar a quantidade de pessoas para cada intervalo.
    
    int[] nQuestoesCertas = new int [10];
    int nota1=0, nota2=0,nota3=0,nota4= 0;
    
    for(int i=0;i<nQuestoesCertas.length;i++){
        nQuestoesCertas[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de respostas certas:"));
        
        if(nQuestoesCertas[i] >=0 && nQuestoesCertas[i]<=25){
            nota1++;
       }
        if(nQuestoesCertas[i] >=26 && nQuestoesCertas[i]<=50){
            nota2++;
        }
        if(nQuestoesCertas[i] >=51 && nQuestoesCertas[i]<=75){
            nota3++;
        }
        if(nQuestoesCertas[i] >=76 && nQuestoesCertas[i]<=100){
            nota4++;
        }
        if(nQuestoesCertas[i]<0){
            break;
        }
           
        }
        JOptionPane.showMessageDialog(null,"Respostas certas de 0 a 25:  "+nota1+
                "\n Respostas certas de 26 a 50:  "+nota2+
                "\n Respostas certas de 51 a 75:  "+nota3+
                "\n Respostas certas de 76 a 100:  "+nota4);
                
    }
    
}
