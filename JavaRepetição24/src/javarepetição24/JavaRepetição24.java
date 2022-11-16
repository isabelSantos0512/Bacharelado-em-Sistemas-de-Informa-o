/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javarepetição24;

import javax.swing.JOptionPane;

public class JavaRepetição24 {

    public static void main(String[] args) {
        // questão 24

        var pulo = "\n";
        int percentual;
        int nome = 0, curso, ingre, sem, ano = 0;
        String curso1 = "", ingre1 = "", sem1 = "";
        int cursol = 0, cursom = 0, cursob = 0, totalDeAlunosMatri = 0;

        //Curso 
        for (int i = 0; i < 3; i++) {

            nome = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu numero: "));
            curso = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha seu curso:" + pulo + "1 - Letras" + pulo + "2 - Matematica" + pulo + "3 - Biologia"));
            ingre = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha sua forma de ingresso: " + pulo + "1 - Vestibular" + pulo + "2 - Transferência" + pulo + "3 - ENEM"));
            sem = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o semestre que voçê entrou:" + pulo + " 1-1º semestre" + pulo + " 2-2º semestre"));
            ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ano ingresso?"));

            if (curso == 1) {
                curso1 = "letras";
                cursol++;
                totalDeAlunosMatri++;

            } else if (curso == 2) {
                curso1 = "matematica";
                cursom++;
                totalDeAlunosMatri++;
            } else if (curso == 3) {
                curso1 = "biologia";
                cursob++;
                totalDeAlunosMatri++;

            } else if (curso > 3 || curso < 0) {
                curso1 = "INVALIDO";
            }
            // Forma de ingresso
            if (ingre == 1) {
                ingre1 = "vestibular";

            } else if (ingre == 2) {
                ingre1 = "transferência";
            } else if (ingre == 3) {
                ingre1 = "ENEM";
            } else if (ingre > 3 || ingre < 0) {
                ingre1 = "INVALIDO";
            }
            //Semetre
            if (sem == 1) {
                sem1 = "primeiro";
            } else if (sem == 2) {
                sem1 = "segundo";
            } else if (sem > 2 || sem < 0) {
                sem1 = "INVALIDO";
            }
        }
        percentual = totalDeAlunosMatri / cursol;
        percentual = totalDeAlunosMatri / cursom;
        percentual = totalDeAlunosMatri / cursob;
        percentual = (percentual * 100);

        JOptionPane.showMessageDialog(null, "Aluno n° " + nome + ", do curso de " + curso1
                + ", que entrou por " + ingre1
                + " no " + sem1 + " semestre de " + ano
                + "\nTotal de alunos no curso de Letras " + cursol
                + "\nTotal de alunos no curso de Matemática " + cursom
                + "\nTotal de alunos no curso de Biológia " + cursob
                + "\nTotal de Alunos Matriculados " + totalDeAlunosMatri
                + "\nPersentual " + percentual + "%");

    }

}
