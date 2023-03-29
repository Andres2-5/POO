package Salud;

public class Empleado extends Persona{
    // Atributos
    private String cargo;
    private String departamento;
    private double valorhora;
    private double horastrabajadas;
    
    // Metodo Constructor con la super clase
    public Empleado(String tipoDoc, int documento, String nombre, String apellido, String cargo, String departamento,
        double valorhora, double horastrabajadas) {
        super(tipoDoc, documento, nombre, apellido);
        this.cargo = cargo;
        this.departamento = departamento;
        this.valorhora = valorhora;
        this.horastrabajadas = horastrabajadas;
    }
    // Metodos Accesores 
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getValorhora() {
        return valorhora;
    }
    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }
    public double getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(double horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }
    // Metodo Propio
public void calcularHonorarios() {
    double valortotal=(valorhora * horastrabajadas);
    double reteica=(0.0096 * valortotal);
    double valorhoro=(valortotal- reteica);
    System.out.println("su valor toral es: " + valorhoro);
}
 public void mostrarEmpleado(){
System.out.println("Los datos registrados del empleado son");
System.out.println("Tipo de documento: " + getTipoDoc());
System.out.println("Numero de Documento" + getDocumento());
System.out.println("Nombre: " + getNombre());
System.out.println("Apellido: " + getApellido());
System.out.println("Cargo: " + cargo);
System.out.println("Departamento: " + departamento);
System.out.println("Horas Trabajadas" + horastrabajadas);
System.out.println("Valor por hora: " + valorhora);
}
}