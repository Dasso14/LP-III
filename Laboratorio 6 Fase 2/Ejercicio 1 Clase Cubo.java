class Cubo extends FiguraTridimensional {
    private double arista;

    public Cubo(String nombre, double arista) {
        super(nombre);
        this.arista = arista;
    }

    @Override
    public double obtenerVolumen() {
        return arista * arista * arista;
    }

    public double obtenerArea() {
        return 6 * arista * arista;
    }
}
