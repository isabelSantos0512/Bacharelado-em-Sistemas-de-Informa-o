/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javarepetiçao30;

import javax.swing.JOptionPane;

public class JavaRepetiçao30 {

    public static void main(String[] args) {
        // Questão 30
        int i, num, count;

        JOptionPane.showMessageDialog(null, "numeros primos entre 1 e 1000 são ");

        for (num = 1; num <= 1000; num++) {
            count = 0;
            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && num != 1) {
             System.out.println(num);
            }
        }
    }
}
        
    



