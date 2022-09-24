import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre = LeerNombre(entrada);
        int edad = LeerEdad(entrada);
        System.out.println("Hola " + nombre + " tienes  " + edad + " años.");
    }
    private static String LeerNombre(Scanner entrada){
        System.out.println("Dime tu nombre: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
    private static int LeerEdad(Scanner entrada){
        int edad = entrada.nextInt();
        return edad;
    }
}