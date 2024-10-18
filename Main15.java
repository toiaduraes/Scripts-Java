import java.util.Scanner;

public class Main15 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Qual sua idade em anos: ");
        int anos = scan.nextInt();

        System.out.println("Além da sua idade em anos, quantos meses incompletos você tem? ");
        int meses = scan.nextInt();

        System.out.println("Além dos meses, indique os dias também: ");
        int dias = scan.nextInt();

        int anos_em_dias = anos * 360; // transforma anos para dias.
        int meses_em_dias = meses * 30; // transforma meses para dias.


        int total = meses_em_dias + anos_em_dias + dias; // total de todos os dias encontramos pelas fórmulas matemáticas anteriores.

        System.out.println("Sua idade em dias é: " + total);
    }
}

//Questão 5: Idade em Dias
//Enunciado: Faça um algoritmo que leia a idade de uma pessoa expressa em anos, 
//meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.