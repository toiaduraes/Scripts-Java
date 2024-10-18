import java.util.Scanner;

public class Main13_2 {
    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o primeiro numero:");
        float valor1 = scan.nextFloat();

        System.out.println("Digite o segundo número:");
        float valor2 = scan.nextFloat ();

        System.out.println("Digite o terceiro número:");
        float valor3 = scan.nextFloat ();

        float media = (valor1 + valor2 + valor3) / 2;
        System.out.println("A média é= " + media);
    }
}
