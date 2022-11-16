/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javarepetição25;

import javax.swing.JOptionPane;

public class JavaRepetição25 {

    public static void main(String[] args) {
        // Questão 25 
           int valor1; valor1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro numero"));
    int valor2; valor2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo numero"));
 
    int resto;
    while (valor2 != 0) {
        resto = valor1 % valor2;
        valor1 = valor2;
        valor2 = resto;
        JOptionPane.showMessageDialog(null, "MDC = " + valor1);
    }

    }
    
}
