package lavadora_uno;

import biblioteca.LLFunciones;
import java.util.Scanner;

public class Lavadora_Uno {
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("¿La ropa es blanca o de color?");
            System.out.println("Presiona 1 - ropa blanca / 2 - ropa de color");
            int TipoDeRopa = entrada.nextInt();
            
            System.out.println("¿Cuantos kilos de ropa?");
            int kilos = entrada.nextInt();
            
            LLFunciones mensaje = new LLFunciones(kilos, TipoDeRopa);
            mensaje.cicloFinalizado();
        }
    
}
