package FigurasGeometricas;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        float lado; 
        float base; 
        float altura; 
        float radio;
        int deci; 
        int resul=1;

        Scanner lectura = new Scanner(System.in);

        while (resul==1) {
            System.out.println("Ingrese cual es la figura la cual quiere calcular el area: 1 Rectangulo 2 Cuadrado 3 Circulo 4 Triangulo");
            deci=lectura.nextInt();

            if(deci==1){
                System.out.println("Ingrese la base del Rectangulo");
                base=lectura.nextInt();
                System.out.println("Ingrese la altura del Rectangulo");
                altura=lectura.nextInt();
                Rectangulo Rectangulo1=new Rectangulo(base, altura);
                Rectangulo1.calcularArea();
            }
            else if(deci==2){
                System.out.println("Ingrese el lado del Cuadrado");
                lado=lectura.nextFloat();
                Cuadrado Cuadrado1=new Cuadrado(lado);
                Cuadrado1.calcularArea();
            }
            else if(deci==3){
                System.out.println("Ingrese el radio del Circulo");
                radio=lectura.nextFloat();
                Circulo Circulo1=new Circulo(radio);
                Circulo1.calcularArea();
            }
            else if(deci==4){
                System.out.println("Ingrese la base del Triangulo");
                base=lectura.nextInt();
                System.out.println("Ingrese la altura del Triangulo");
                altura=lectura.nextInt();
                Triangulo Triangulo1=new Triangulo(base, altura);
                Triangulo1.calcularArea();
            }

            System.out.println("¿Quiere calcular otra figura? 1 Si 2 No");
            resul=lectura.nextInt();
        }
        lectura.close();
    }
}