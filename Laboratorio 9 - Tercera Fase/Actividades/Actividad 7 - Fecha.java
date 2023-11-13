import java.io.Serializable;

public class Fecha implements Serializable {
    private int dia;
    private int mes;
    private int año;

    @Override
    public String toString() {
        return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
    }
}
