
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
public class estu {
    public static void main (String[]args){
        
        //É um menu com diversas opiçoes
        
        Scanner açai = new Scanner (System.in);
        int v = 0;

        while (v != 1 ){

            System.out.print ("Menu principal!  \n");
            System.out.print ("Digite 1 para sair, 2 para tabuada, 3 notas do boletim,"
                    + "\n 4 para caucular media das notas dos alunos por turma, \n 5 para caucular"
                    + " media das notas dos alunos sem quantidade de alunos definidas \n, 6 para brincar com ? de testes... \n");
            v = açai.nextInt();

            if(v == 2 ){

                int n,mul,np =1;
                System.out.print ("você quer a tabuada de qual numero?  \n");
                n = açai.nextInt();

                while(np <=10){
                    mul =np * n;
                    System.out.printf ("%d X %d = %d ; \n" ,np,n,mul);
                    np++;
                }
            }
            if(v == 3 ){
                int n1,n2,med=0,bi,estar,t=1;

                System.out.print("Qual a materia?  \n");  
                String mate = açai.next(); 
                System.out.print("Quantos bimestres tem?  \n");  
                bi = açai.nextInt(); 
                System.out.print("em qual bimestres voce ta?  \n");  
                estar = açai.nextInt(); 
                System.out.print("qual é a nota minima para passar em um bimestre?  \n");  
                n2 = açai.nextInt(); 

                while(t<=estar){
          
                    System.out.printf("Qual %d° nota?  \n",t);  
                    n1=açai.nextInt();

                    med = med+n1;
                    t++;
                }
          
                med = med/bi;
                System.out.printf("Sua media foi %d  \n",med); 
            }
            if(v == 4 ){
                double nota,soma = 0, media;
                int nAlunos, f=1;

                System.out.print("quantidade de alunos:  ");
                nAlunos = açai.nextInt();

                while(f <= nAlunos){

                    System.out.print("\n nota do " + v+"º alunos ");
                    nota = açai.nextInt();

                    soma = nota + soma; 
                    v++;
                }
                media = soma/nAlunos;
                System.out.print("\n media dos alunos  " + media);
            }
            if(v == 5 ){
          
                double nota,soma = 0, media;
                int b =1;

                System.out.print("\n nota do " + b+"º alunos ");
                nota = açai.nextInt();

                soma = nota + soma; 
                b++;

                while(nota>=0){
                    System.out.print("\n nota do " + b+"º alunos ");
                    nota = açai.nextInt();

                    soma = nota + soma; 
                    b++;
                }
   
                media = soma/b;
                System.out.print("\n media dos alunos  " + media);
            }
            if(v == 6 ){
                int numero;
                String resposta;

                System.out.print("Digite um numero inteiro: ");
                numero = açai.nextInt();

                resposta = numero % 2 == 0 ? "paTermo" : "impar";
                System.out.printf("O numero eh %s.\n", resposta);
            }
            if(v>1 && v<6) {
                System.out.print ("\n O item digitado não faz parte do menu, porfavor corrigir! \n");
            }
        }
        System.out.print ("obrigado pela preferencia \n ");
    }
}
