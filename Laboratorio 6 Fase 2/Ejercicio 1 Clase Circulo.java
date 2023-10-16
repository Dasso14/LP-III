class Circulo extends FiguraBidimensional {
    private double radio;
    private String color;

    public Circulo(String nombre, double radio, String color) {
        super(nombre);
        this.radio = radio;
        this.color = color;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    public String obtenerColor() {
        return color;
    }
}
