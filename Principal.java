package br.com.exercicio; 

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("--- Exercício 1: Soma de Inteiros ---");
        
        System.out.print("Digite o primeiro número: ");
        int n1 = leitor.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int n2 = leitor.nextInt();
        
        int soma = n1 + n2;
        
        System.out.println("A soma de " + n1 + " + " + n2 + " é igual a: " + soma);
        
        leitor.close();
    }
}