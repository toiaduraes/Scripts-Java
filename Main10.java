package main;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o primeiro numero:");
        float valor1 = scan.nextFloat();

        System.out.println("Digite o segundo numero:");
        float valor2 = scan.nextFloat();

        float valorMaior = Math.max(valor1, valor2);
        float valorMenor = Math.min(valor1, valor2);

        System.out.println("Maior valor: " + valorMaior);
        System.out.println("Menor valor: " + valorMenor);
    }
}
