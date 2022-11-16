/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javarepetição22;

import javax.swing.JOptionPane;


public class JavaRepetição22 {

    public static void main(String[] args) {
        //Salario e numero de filhos
        float salario [] =  new float [3];
        int filhos [] = new int [3];
        float totalDeSalario = 0;
        float totalDeFilho = 0;
        float totalDeSalarios = 0;
        int   menorSalario = 0;
        float percentual = 0;

        //Inserção dos dados
        for(int i = 0; i < salario.length; i++){
            salario[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu salario"));
            filhos[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos filhos você tem?"));
        }

        //Soma de todos os salarios                                                                                                                                                                                                         
        for(int i = 0; i < salario.length; i++){
            totalDeSalario = totalDeSalario + salario[i];
            totalDeFilho = totalDeFilho + filhos[i];
            if(totalDeSalarios < salario[i]){
                totalDeSalarios = salario[i];
              }  
            
            if(salario[i] <= 200){
            menorSalario++;
              
            }
                    
        }
        //valor do percentual de pessoas.
         percentual =menorSalario*100/salario.length;
        {

        //Media do salario
       
        totalDeSalario = totalDeSalario / salario.length;
        totalDeFilho = totalDeFilho / salario.length;
        
       JOptionPane.showMessageDialog(null,"A media de salarios é de "+totalDeSalario+
                "\n A média de filhos é de "+totalDeFilho+"\n O maior salário é "+totalDeSalarios+
                "\n A quantidade de pessoas que recebem até 200 reais é "+percentual);

        }
    }
    
}
