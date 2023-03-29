package Principal;
import java.util.Scanner;
import Salud.Empleado;
import Salud.Persona;


public class Inicio {
    public static void main(String[] args) {
    String cargo; 
    String departamento;
    int valorhora; 
    int horastrabajadas;

    Scanner lectura=new Scanner(System.in);
    Persona c = new Persona();

    // reto 3
        System.out.println("Digite su cargo");
        cargo=lectura.next();
        System.out.println("Digite su departamento");
        departamento=lectura.next();
        System.out.println("Digite cuanto gana por hora");
        valorhora=lectura.nextInt();
        System.out.println("Digite el numero de horas trabajadas");
        horastrabajadas=lectura.nextInt();
        
        //Retos 1 y 2
        double resultado, peso=0, estatura=0;
        //crear un objeto->instancia de una clase
        c.pedirDatos();

        Empleado a =new Empleado(c.getTipoDoc(),c.getDocumento(),c.getNombre(),c.getApellido(), cargo, departamento,valorhora,horastrabajadas);
        //invocando un metodo
        c.mostrarPersona();
        a.mostrarEmpleado();
        a.calcularHonorarios();

        resultado=c.calcularImc(peso, estatura);

        /*
        
        if (resultado<20){
            System.out.println("PESOBAJO");
        }
        else if (resultado >= 20 && resultado <= 25){
            System.out.println("PESOIDEAL");
        }
        else{
            System.out.println("SOBREPESO");
        }

*/
        // n.calcularImc();
        // n.mayorEdad(); 
   }

   
}