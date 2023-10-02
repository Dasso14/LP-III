public class EmpleadoDistribucion extends Asalariado {
    private String region;

    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, double salarioBase, String region) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public double calcularNomina() {
        // Incremento del 10% para empleados de distribución
        return getSalarioBase() * 1.10;
    }
