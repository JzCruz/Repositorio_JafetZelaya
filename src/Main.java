
import java.util.Scanner;
import persona.Deportista;
import persona.Doctor;
import persona.Persona;

public class Main {
    public static void main(String[] args) {
        // Ingresar datos de la persona
        try (Scanner scanner = new Scanner(System.in)) {
            // Ingresar datos de la persona
            System.out.println("Ingrese el nombre de la persona:");
            String nombrePersona = scanner.nextLine();
            System.out.println("Ingrese la edad de la persona:");
            int edadPersona = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner
            
            Persona persona1 = new Persona(nombrePersona, edadPersona);
            System.out.println(persona1.obtenerInformacion());
            
            // Ingresar datos del doctor
            System.out.println("Ingrese el nombre del doctor:");
            String nombreDoctor = scanner.nextLine();
            System.out.println("Ingrese la edad del doctor:");
            int edadDoctor = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner
            System.out.println("Ingrese la especialidad del doctor:");
            String especialidadDoctor = scanner.nextLine();
            
            Doctor doctor1 = new Doctor(nombreDoctor, edadDoctor, especialidadDoctor);
            System.out.println(doctor1.obtenerInformacion());
            
            // Ingresar datos del deportista
            System.out.println("Ingrese el nombre del deportista:");
            String nombreDeportista = scanner.nextLine();
            System.out.println("Ingrese la edad del deportista:");
            int edadDeportista = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner
            System.out.println("Ingrese el deporte del deportista:");
            String deporteDeportista = scanner.nextLine();
            
            Deportista deportista1 = new Deportista(nombreDeportista, edadDeportista, deporteDeportista);
            System.out.println(deportista1.obtenerInformacion());
        }
    }
}
