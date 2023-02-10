
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User1
 */
public class lacosRepeticao {
    
    public static void main (String[]args){
        Scanner açai = new Scanner (System.in);

        //ele vai somar todas as notas enquanto a nota for maior que ou igual a 0, portanto para encerrar as adiçoes
        // de notas é só colocar um numero negativo.

        double nota,soma = 0, media;
        int v =1;

        System.out.print("\n nota do " + v+"º alunos ");
        nota = açai.nextInt();

        soma = nota + soma; 
        v++;

        while(nota>=0){

            System.out.print("\n nota do " + v+"º alunos ");
            nota = açai.nextInt();

            soma = nota + soma; 
            v++;
        }
        media = soma/v;
        System.out.print("\n media dos alunos  " + media);
    }
}
    
   