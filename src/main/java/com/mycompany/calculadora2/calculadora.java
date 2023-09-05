//Dedicado a todos a que lerem o codigo;
package com.mycompany.calculadora2;
import java.util.Scanner;

//CLASSE PRINCIPAL(A UNICA KKKK!)
public class calculadora {
    //FUNÇÃO PRINCIPAL(A UNICA TMB KSKSKS!)
    public static void main(String[] args) {
        double numero1, numero2;
        double soma, subtracao, divisao, multiplicacao; 
        int opt, quadrado ;
        Scanner input = new Scanner(System.in);
        quadrado = 0;
        //LAÇO PRINCIPLA DE EXECUÇÃO
        do{
            System.out.println("[ESCOLHA UMA OPERAÇÃO:");
            System.out.println("[1] - SOMA");
            System.out.println("[2] - SUBTRAÇÃO");
            System.out.println("[3] - DIVISAO");
            System.out.println("[4] - MULTIPLICAÇÃO");
            System.out.println("[5] - QUADRADO²");
            System.out.println("[6] - SAIR");
            opt = input.nextInt();
            //SELEÇÃO DE CASOS
            switch(opt){
                case 1:
                    System.out.println("*******");
                    System.out.println("OPERAÇÃO DE SOMA:");
                    System.out.println(' ');
                    numero1 = input.nextDouble();
                    System.out.println(' ');
                    numero2 = input.nextDouble();
                    soma = numero1 + numero2;
                    System.out.println(soma);
                    break;
                case 2:
                    System.out.println("********");
                    System.out.println("OPERAÇÃO DE SUBTRAÇÃO:");
                    System.out.println(' ');
                    numero1 = input.nextDouble();
                    System.out.println(' ');
                    numero2 = input.nextDouble();
                    subtracao = numero1 - numero2;
                    System.out.println(subtracao);
                    break;
                case 3:
                    System.out.println("********");
                    System.out.println("OPERAÇÃO DE DIVISÃO:");
                    System.out.println(' ');
                    numero1 = input.nextDouble();
                    System.out.println(' ');
                    numero2 = input.nextDouble();
                    divisao = numero1 / numero2;
                    System.out.println(divisao);
                    break;
                case 4:
                    System.out.println("*********");
                    System.out.println("OPERAÇÃO DE MULTIPLICAÇÃO");
                    System.out.println(' ');
                    numero1 = input.nextDouble();
                    System.out.println(' ');
                    numero2 = input.nextDouble();
                    multiplicacao = numero1 * numero2;
                    System.out.println(multiplicacao);
                    break;
                case 5:
                    System.out.println("*******");
                    System.out.println("OPERAÇÃO DE QUADRADO²");
                    System.out.println(' ');
                    numero1 = input.nextInt();
                    quadrado = (int) (numero1 * numero1);
                    System.out.println(quadrado);
                    break;
            }
        //QUEBRA DO CODIGO SELECIONANDO A OPCAO SAIDA(6)    
        }while(opt != 6);       
    }
}