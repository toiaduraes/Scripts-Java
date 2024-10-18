package main;

import java.util.Scanner;

public class Main09 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o primeiro numero:");
        int valor1 = scan.nextInt();

        System.out.println("Digite o segundo número:");
        int valor2 = scan.nextInt ();

        int soma = valor1 + valor2;
        int subtracao = valor1 - valor2;
        float divisao = valor1 / valor2; //procurar erro. 2/4= 1/2 mas aparece 0.0
        float multiplicacao = valor1 * valor2;

        System.out.println("Soma= " + soma);
        System.out.println("Substração= " + subtracao);
        System.out.println("divisao= " + divisao);
        System.out.println("multiplicacao= " + multiplicacao);
    }
}