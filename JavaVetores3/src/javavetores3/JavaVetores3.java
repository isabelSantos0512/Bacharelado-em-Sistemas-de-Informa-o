/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javavetores3;


public class JavaVetores3 {

    public static void main(String[] args) {
        //Questão 3
          int[] a = { 2, 3, 4, 5 };
        System.out.println("Agora a ordem original");
        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + a[i] + "]");
        }
        System.out.println();
        for (int j = a.length - 1; j >= 0; j--) {
            System.out.print("[" + a[j] + "]");
        }
    }
    
}
