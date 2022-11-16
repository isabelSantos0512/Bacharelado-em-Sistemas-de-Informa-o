/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javavetores4;

import javax.swing.JOptionPane;

/**
 *
 * @author isabe
 */
public class JavaVetores4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Questões
        // questão 4
        //Ler 30 números reais em um vetor e 
        //depois exibir os números localizados nas posições impares

        double[] nreal = new double[30];

        for (int i = 0; i < nreal.length; i++) {

            nreal[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor:  "));

        }
        for (int i = 4; i != -1; i--) {

            if ((nreal[i] % 2) == 1) {
                JOptionPane.showMessageDialog(null, nreal[i]);
            } else {
            }
        }

    }

}
