import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String Nombre = scanner.next();
        System.out.print("Ingrese el apellido: ");
        String Apellido = scanner.next();
        System.out.print("Ingrese el numero de cedula: ");
        String Cedula = scanner.next();
        System.out.print("Ingrese la fecha de nacimiento (dd/mm/yyyy): ");
        String FechaNacimiento = scanner.next();

        Usuario usuario = new Usuario(Nombre, Apellido, Cedula, FechaNacimiento);
        int edad = usuario.calcularEdad();

        System.out.println("\nNombre: "+usuario.getNombre()+" "+usuario.getApellido());
        System.out.println("Numero de cedula: "+usuario.getCedula());
        System.out.println("Fecha de nacimiento: " +usuario.getFechaNacimiento());
        System.out.println("Edad: " +edad);
    }
}