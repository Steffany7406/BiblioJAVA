import java.util.Scanner;

public class  UsandoInput {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); // Criando um objeto Scanner para ler dados do teclado
        System.out.printf("Qual é o seu nome? "); // Pergunta ao usuário
        String nome = scanner.nextLine(); // Lê a resposta do usuário e armazena em uma variável

        System.out.println("Olá, "+nome); // Exibe uma mensagem com o nome do usuário

        scanner.close(); // Fecha o objeto Scanner para evitar problemas de memória
    }
}