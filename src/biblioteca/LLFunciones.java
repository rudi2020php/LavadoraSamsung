/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 * Clase para las funciones lógicas de una lavadora
 */
package biblioteca;

/**
 *
 * @author rudi.dearcia
 */
public class LLFunciones {

    private int kilos = 0, TipoDeRopa = 0, llenadoCompleto = 0, lavadoCompleto = 0, secadoCompleto = 0;

    public LLFunciones(int kilos, int TipoDeRopa) {//Método contructor
        this.kilos = kilos;
        this.TipoDeRopa = TipoDeRopa;
    }

    private void Llenado() {//Este Método sirve para llenar con la capacidad adecuada
        if (kilos <= 12) {
            llenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("Llenado Completado !");
        } else {
            System.out.print("Máximo es 12 Kgrs.");
        }
    }

    private void Lavado() {//este Método sirve para el lavado
        Llenado();
        if (llenadoCompleto == 1) {
            if (TipoDeRopa == 1) {//Elige el tipo de ropa a lavar
                System.out.println("Ropa Blanca / Lavado suave");
                System.out.println("Lavando... Lavado suave");
                lavadoCompleto = 1;
            } else if (TipoDeRopa == 2) {
                System.out.println("Ropa de Color / Lavado intenso");
                System.out.println("Lavando .... ropa de color");
                lavadoCompleto = 1;
            } else {
                System.out.println("Opcion no valida");
                System.out.println("Se lavará como ropa de Color / Lavado intenso");
                lavadoCompleto = 1;
            }

        } else {
            System.out.println("Errrorrr... de llenado");
        }
    }

    private void Secado() {//Método para secado
        Lavado();
        if (lavadoCompleto == 1) {
            System.out.println("Secando ...");
            secadoCompleto = 1;
        }
    }
    
    public void cicloFinalizado(){ //Fin del proceso
        Secado();
        if(secadoCompleto == 1){
            System.out.println("lavado Completo!..");
        }
    }
}
