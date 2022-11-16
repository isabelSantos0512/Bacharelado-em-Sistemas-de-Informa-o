/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javarepetição29;

import javax.swing.JOptionPane;

public class JavaRepetição29 {

    public static void main(String[] args) {
        // questão29. calcular o numero de graos de milho que se pode calocar num taboleiro
        //de xadrez.O resultado é maior ou menor do que o que vc esperava?
        
        long casas;
        int valor;
        String val;
        int contador = 0;

        casas = 1;
        val = JOptionPane.showInputDialog(null, "Digite um valor");
        valor = Integer.parseInt(val);

        if (valor > 63) {
            JOptionPane.showMessageDialog(null, "2^" + valor);
        } else {

            do {
                casas = casas * 2;
                contador++;
            } while (contador < valor);

            JOptionPane.showMessageDialog(null, casas);
        }

    }

}
