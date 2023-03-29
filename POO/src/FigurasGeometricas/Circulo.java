package FigurasGeometricas;

public class Circulo {
    // Atributos
    private float radio;
    
    // Metodo Constructor
    public Circulo (float radio){
    this.radio=radio;
    }

    // Metodos Accesores
    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }

    // Metodo Propio
    public void calcularArea() {
        double area;
        area=(3.1416*radio)*2;
        System.out.println("El radio del Circulo es: " + radio);
        System.out.println("El area del Circulo es: " + area);
     }
}
