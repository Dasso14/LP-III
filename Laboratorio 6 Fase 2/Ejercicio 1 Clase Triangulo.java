class Triangulo extends FiguraBidimensional {
    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        return 0.5 * base * altura;
    }
}
