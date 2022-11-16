/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javarepeticao26;
import javax.swing.JOptionPane;

public class JavaRepeticao26 {

    
    public static void main(String[] args) {
        // 26. Ler um número inteiro e imprimir se ele é primo ou não.
        
       //x>=0 e x/x ou por x/1
       //Variáveis 
       int x;
        int contador=0;
         //inserindo um valor
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja verificar se um número é primo ou não?\n Digite aqui: "));
        //laço de repetiçao do tipo for, para testa um valor.
        for(int i=x; i>0;i--){
            
            if(x%i==0){
          contador++;
            }
        }
       
        if(contador==2){
            
            
          JOptionPane.showMessageDialog(null," Este número é primo! ");
        
        }
        else{
            JOptionPane.showMessageDialog(null,"Este número não é primo: ");
        }  
    }
    
}
