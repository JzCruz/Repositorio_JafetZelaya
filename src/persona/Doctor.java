package persona;

public class Doctor extends Persona {
    private String especialidad;

    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public void establecerEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + ", Especialidad: " + especialidad;
    }
}