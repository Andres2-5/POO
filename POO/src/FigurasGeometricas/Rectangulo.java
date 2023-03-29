package FigurasGeometricas;

public class Rectangulo {
    // Atributos
    private float base;
    private float altura;
    
    // Metodo Constructor
    public Rectangulo (float base, float altura){
        this.base=base;
        this.altura=altura;
    }

    // Metodos Accesores
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Metodo Propio
    public void calcularArea() {
        float area;
        area=base*altura;
        System.out.println("La base del rectangulo es " + base);
        System.out.println("La altura del Rectangulo es: " + altura);
    }
}
