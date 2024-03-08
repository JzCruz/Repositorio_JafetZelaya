package persona;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    public void establecerEdad(int edad) {
        this.edad = edad;
    }

    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}