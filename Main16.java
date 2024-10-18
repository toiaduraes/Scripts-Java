import java.util.Scanner;

public class Main16 {
    public static void main(String[] args){
    Scanner scan = new Scanner (System.in);

    System.out.println("Qual o total de eleitores? ");
    float eleitores = scan.nextFloat();

    System.out.println("Qual o número de votos brancos?");
    float brancos = scan.nextFloat();

    System.out.println("Qual o número de votos nulos? ");
    float nulos = scan.nextFloat();

    System.out.println("Qual o número de votos válidos? ");
    float validos = scan.nextFloat();

    float votosBrancos = (brancos / eleitores) * 100; // percentual de votos brancos com relação ao número de eleitores
    float votosNulos = (nulos / eleitores) * 100; // percentual de votos nulos com relação ao número de eleitores
    float votosValidos = (validos / eleitores) * 100; // percentual de votos válidos com relação ao número de eleitores

    System.out.println ("Percentual de votos brancos: " + votosBrancos + " % Percentual de votos Nulos: " + votosNulos + " % Percentual de votos válidos: " + votosValidos + " %");
    }

}



// Questão 6: Percentuais de Votos
// Enunciado: Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. 
// Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

