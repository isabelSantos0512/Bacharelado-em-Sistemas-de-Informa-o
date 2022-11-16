/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javavetores5;

import javax.swing.JOptionPane;

public class JavaVetores5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Questão 5
       //50 valores reais 
       // impares aumentados em 5%
       // pares aumentados em 2%
       //imprima o resultado em um vetor.
       
       double[] num = new double [50];
       
       for(int i=0; i<num.length;i++){
           num[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE UM VALOR: "));
       }
       for(int i=0;i<50;i++){
           //impares
           if((num[i]% 2)==1){
              num[i] = num[i]*1.05;
            JOptionPane.showMessageDialog(null,""+num[i]);  
           }
            
           
           //pares
           else{
               num[i]=num[i]*1.02;
             JOptionPane.showMessageDialog(null,""+num[i]);   
           }
       }
    }
    
}
