import Datos.Persona;

public class Alumno extends Persona{
    private Fecha fecha matricula;
    public Alumno(String nif, String nombre, int edad, Fecha fechaMatricula) {
        super(nif, nombre, edad);
        this.fechaMatricula = new Fecha();
        setFechaMatricula(fechaMatricula);
    }
    public Alumno(){
    }

    public Fecha getFechaMatricula(){
        return fechaMatricula;
    }

    public void setFechaMatricula(Fecha fechaMatricula){
        this.fechaMatricula.setDia(fechaMatricula.getDia());
        this.fechaMatricula.setMes(fechaMatricula.getMes());
        this.fechaMatricula,setAno(fechaMatricula.getAno());
    }
}
