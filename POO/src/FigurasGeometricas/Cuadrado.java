package FigurasGeometricas;

public class Cuadrado extends Figura {
    // Atributos
   private float lado;

   // Metodo Constructor
   public Cuadrado (float lado){
   this.lado=lado;
   }

   // Metodos Accesores
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
     
    // Metodo Propio
    public void calcularArea() {
       float area;
       area=lado*lado;
       System.out.println("El lado del Cuadrado es: " + lado);
        System.out.println("El area del Cuadrado es: " + area);
    }
}