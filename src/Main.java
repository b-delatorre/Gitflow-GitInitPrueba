import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner entrada = new Scanner(System.in);
        String nombre = LeerNombre(entrada);
        String fechaNacimiento = LeerFechaNacimiento(entrada);
        System.out.println("Hola " + nombre + " naciste el  " + fechaNacimiento + " .");
        LocalDate diaDeHoy = LocalDate.now();
        LocalDate nacimiento = ConversionALocalDate(fechaNacimiento);
        long dias = CalcularDias(nacimiento, diaDeHoy);
        System.out.println("Han pasado " + dias + " dias desde que naciste.");
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
    private static LocalDate ConversionALocalDate(String FechaNacimiento) throws ParseException {
        //Convertimos el string a date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha =  sdf.parse(FechaNacimiento);

        // Conversion para poder calcular
        LocalDate fechaLocal = Instant.ofEpochMilli(fecha.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        return fechaLocal;
    }
    private static long CalcularDias(LocalDate nacimiento, LocalDate hoy){
        long dias = DAYS.between(nacimiento, hoy);
        return dias;
    }
}