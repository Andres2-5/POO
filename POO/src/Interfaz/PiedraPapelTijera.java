package Interfaz;
import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera implements Juego { 
        // Atributos
        private int computa;
        private int juga;
        
        Scanner lectura=new Scanner(System.in);
        
    public void iniciar(){
        System.out.print("ingrese que quiere elegir: 2 tijera, 3 papel, 4 piedra");
       juga=lectura.nextInt(); 
    }

    public void jugar(){
        Random ran=new Random();
        computa=ran.nextInt(3);
    }

    public void finalizar(){
        if (computa==1 ) {
            if (juga==3 ) {
            System.out.print("Felicidades usted a ganado la maquina saco piedra");
            }
           else if (juga==2) {
            System.out.print("Mala suerte usted perdio la maquina saco papel");
           }
           else {
            System.out.print("Nadie gano la maquina saco tijera");
           }
        } 
        else if (computa==3) {
            if (juga==2) {
                System.out.print("Felicidades usted a ganado la maquina piedra");
            }
           else if (juga==3) {
            System.out.print("Nadie gano la maquina saco papel");
           }
           else {
            System.out.print("Mala suerte usted perdio la maquina saco tijera");
           } 
        }
        else {
            if (juga==2) {
                System.out.print("Usted a perdido la maquina saco piedra");
            }
           else if (juga==3) {
            System.out.print("Felicidades a ganado la maquina saco papel");
           }
           else {
            System.out.print("Nadie gano la maquina saco tijera");
           } 
        
        }
    }
}
