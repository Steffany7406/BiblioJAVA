import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> fila = new ArrayList<>();

       fila.add(255);
       fila.add(312);
       fila.add(883);
       fila.add(122);
       fila.add(9);

        System.out.println("Lista: "+ fila);
        
        Integer valorRetirado = fila.remove(0);
        
        System.out.println("Valor retirado: "+ valorRetirado);    
        System.out.println("Lista Atual: "+ fila);
        
    }
}