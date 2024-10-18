import java.util.Scanner;

public class Main11 {
    //imprimir Nome do usuário: Escreva um programa Java que solicite ao usuário o seu nome e exiba a mensagem "Olá, [Nome]!", substituindo [Nome] pelo nome do usuário.
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite seu nome aqui:");
        String nomeUsuario = scan.nextLine();
        // se usarmos apenas o scan.next ele irá ler apenas o primeiro nome, se usarmos o nextLine,
        // lerá todos os nomes até que o usuário aperte entrer

        System.out.println("Olá, " + nomeUsuario + "!");
    }
        

}
