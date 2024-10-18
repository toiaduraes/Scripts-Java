import java.util.Scanner;

public class Main14 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o primeiro numero:");
        float valor1 = scan.nextFloat();

        float sucessor = valor1 + 1;
        float antecessor = valor1 - 1;

        System.out.println("O Antecessor é: " + antecessor + "O sucessor é: " + sucessor);
    } 
}

//Questão 4: Antecessor e Sucessor
//Enunciado: Escreva um algoritmo para ler um valor inteiro (do teclado) e escrever (na tela) o seu antecessor e seu sucessor.

