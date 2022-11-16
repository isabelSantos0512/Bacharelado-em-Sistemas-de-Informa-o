/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javavetores10;


public class JavaVetores10 {

    
    public static void main(String[] args) {
        //QUESTÃO 10
        //Crie um algoritmo que conte ate 100
        //se o numero for par P, se o numero for impar I
        
        //ARRAYS
        
        String []num= new String [100];
      
        
        
        for(int i=1; i<100;i++){
          //Se for PAR 
           if(i%2==0){
             
               num[i]="p";
            
           }//Se não IMPAR
           else{
                num[i]= "i";
            
           }
        
        }
        for(int i=1; i<100; i++){
           // ler 
            System.out.println(num[i]);

        }
    }
    
}
