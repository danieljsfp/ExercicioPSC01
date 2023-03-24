/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicadetroco;

/**
 *
 * @author macmini
 */
public class LogicaDeTroco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        neryFor(225);
    }

    public static void neryFor(int troco){
                // TODO code application logic here
        int resto = 0;
        int total_notas = 0;
        //int troco = 225;
        int notas[] = new int [7];
        notas[0] = 200;
        notas[1] = 100;
        notas[2] = 50;
        notas[3] = 20;
        notas[4] = 10;
        notas[5] = 5;
        notas[6] = 2;

        
        int contador = 0;
        
        for (contador = 0 ; contador <= 6 ; contador = contador +1) {
            resto = troco % notas[contador]; 
            total_notas = (troco - resto)/notas[contador];
            if (total_notas != 0) {
                System.out.println("Notas " + notas[contador] + " " + resto + " total notas " + total_notas + " contador " + contador);
            }
            
            troco = resto;
            if (troco == 0) {
                contador = 10;
            } 
            
        }
    }
    
    
    
   public static void nery() {
       
        // TODO code application logic here
        int resto = 0;
        int total_notas = 0;
        int troco = 225;
        int notas[] = new int [7];
        notas[0] = 200;
        notas[1] = 100;
        notas[2] = 50;
        notas[3] = 20;
        notas[4] = 10;
        notas[5] = 5;
        notas[6] = 2;
        
        int contador = 0;
        
        while(contador >= 0 && contador <= 6) {
            resto = troco % notas[contador]; 
            total_notas = (troco - resto)/notas[contador];
            if (total_notas != 0) {
                System.out.println("Notas " + notas[contador] + " " + resto + " total notas " + total_notas + " contador " + contador);
            }
            
            troco = resto;
            if (troco == 0) {
                contador = 10;
            } else {
                contador = contador + 1;
        }
            
        }   
    }  
} 
