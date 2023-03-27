/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas;
import java.util.Scanner;
/**
 *
 * @author macmini
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double notasAluno[] = new double[3];
        Scanner sc = new Scanner(System.in);
        double media = 0;
        
        // pede a nota
        // le a nota
        // testa a nota
        // se < 0 ou > 10 avisa que digitou errado 
        // se < 0 ou > 10 pede de novo
        
        
        for (int i =0; i <3; i = i+1) {
            
            do {
                System.out.println("Digite a nota A" + (i+1));
                notasAluno[i] = sc.nextDouble();
                if ((notasAluno[i] < 0) || (notasAluno[i] > 10)) {
                    System.out.println("Você digitou a nota errada. ");
                }

            } while ((notasAluno[i] < 0) || (notasAluno[i] > 10));

        }
        
        
        for (int i = 0; i <3; i++) {
            media = media + notasAluno[i];
        }
        
        media = media/3;
        System.out.println("A média das notas é: " + media);
        
    }
    
}
