package Principal5;

public class CuentaBanco {
    private String titular;
    private double cantidad;

    public CuentaBanco(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public CuentaBanco(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "CuentaBanco [titular=" + titular + ", cantidad=" + cantidad + "]";
    }

    public void ingresar(double cantidad1) {
        if (cantidad1 >= 0) {
            this.cantidad += cantidad1;
        }
    }

    public void retirar(double cantidad1) {
        this.cantidad -= cantidad1;
        if (this.cantidad < 0) {
            this.cantidad = 0;
        }
    }
}
