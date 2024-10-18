// Questão 2: Imprimir a Soma de Dois Números
//Enunciado: Crie um programa Java que leia dois números inteiros do usuário e exiba a soma desses números.

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o primeiro numero:");
        int valor1 = scan.nextInt();

        System.out.println("Digite o segundo número:");
        int valor2 = scan.nextInt ();

        int soma = valor1 + valor2;

        System.out.println("Soma= " + soma);
    }
}
