import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre = LeerNombre(entrada);
        String fechaNacimiento = LeerFechaNacimiento(entrada);
        System.out.println("Hola " + nombre + " naciste el  " + fechaNacimiento + " .");
    }
    private static String LeerNombre(Scanner entrada){
        System.out.println("Dime tu nombre: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
    private static String LeerFechaNacimiento(Scanner entrada){
        System.out.println("Introduce tu fecha de nacimiento en el formato (DD/MM/AAAA): ");
        String fechaNacimiento = entrada.nextLine();
        return fechaNacimiento;
    }
}