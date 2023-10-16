class Esfera extends FiguraTridimensional {
    private double radio;

    public Esfera(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double obtenerVolumen() {
        return (4.0 / 3.0) * Math.PI * radio * radio * radio;
    }

    public double obtenerArea() {
        return 4 * Math.PI * radio * 2;
    }
