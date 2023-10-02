public class Rectangulo extends FiguraGeometrica {
    private double base;
    public double getBase() {
        return base;
    }

    private double altura;

    public Rectangulo(double base, double altura) {
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }
    
    public double area() {
        return this.base = this.altura;
    }
}
