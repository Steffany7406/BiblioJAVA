public class UsandoIf {
    public static void main(String[] args) {
        int experiencia = 5;
        
        if (experiencia <2){
            System.out.println("Desenvolvedor Junior");
        } else if (experiencia >= 2 && experiencia < 5){
            System.out.println("Desenvolvedor Pleno");
        } else{
            System.out.println("Desenvolver Senior");
        }
    }
}

/* Com Input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in); 
        int experiencia;
        
        System.out.printf("Informe seu tempo de experiência: ");
        experiencia = test.nextInt();
        
        if (experiencia <2){
            System.out.println("Olá, Desenvolvedor Junior!");
        } else if (experiencia >= 2 && experiencia < 5){
            System.out.println("Olá, Desenvolvedor Pleno!");
        } else{
            System.out.println("Olá, Desenvolver Sênior!");
        }
    }
}

*/