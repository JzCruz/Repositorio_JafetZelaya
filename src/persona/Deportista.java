package persona;

public class Deportista extends Persona {
    private String deporte;

    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }

    public String obtenerDeporte() {
        return deporte;
    }

    public void establecerDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + ", Deporte: " + deporte;
    }
}
