package FigurasGeometricas;

public class Triangulo {
    // Atributos
    private float base;
    private float altura;

    // Metodo Constructor
    public Triangulo (float base, float altura){
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
        area=(base*altura)/2;
        System.out.println("La base del triangulo es: "+ base);
        System.out.println("El area del Triangulo es: "+ area);
     }
}
