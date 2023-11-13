public class Alumno extends Persona {
    private Fecha fechaInscripcion;

    public void setFechaInscripcion(Fecha fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public Fecha getFechaInscripcion() {
        return fechaInscripcion;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + getNombre() + ", edad=" + getEdad() + ", fechaInscripcion=" + fechaInscripcion + "]";
    }
}
