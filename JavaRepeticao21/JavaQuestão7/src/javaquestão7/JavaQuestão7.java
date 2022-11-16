/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaquestão7;
import javax.swing.JOptionPane;
public class JavaQuestão7 {

    public static void main(String[] args) {
        //QUESTÃO 7
        //ler dois vetores de numeros inteiros de cada um com 30 posições.
        // soma dos ultimos dois vetores
    //arrays    
    int[] valor = new int [30];
    int[] valor2 = new int [30];
    int[] soma = new int [30];
    //laço
    for(int i=0; i<valor.length;i++){
        valor[i] =Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE UM VALOR: "));
        valor2[i] =Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE um VALOR"));
        
        //Soma dos vetores
         soma [i]= valor[i]+valor2[i];
         // ler soma
         System.out.println(soma[i]);
        
    }
  
    
    }
    
}
