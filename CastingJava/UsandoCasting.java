public class UsandoCasting{ // Casting é a conversão de um tipo de dado para outro
    public static void main(String[] args) {
        int idade = 25; // idade é um inteiro
        double idade1 = idade; // idade1 agora é um double
 
        //Fazendo o inverso
        idade = (int) idade1; // idade agora é um inteiro novamente (Isso se chama casting explicito)

       //Fazendo caracter virar String
        char letra = 'A';
        String nome = String.valueOf(letra);
        System.out.println(nome);
        
    }
}