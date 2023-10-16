class Tetraedo extends FiguraTridimensional {
    private double arista;
    private String aplicacion;

    public Tetraedo(String nombre, double arista, String aplicacion) {
        super(nombre);
        this.arista = arista;
        this.aplicacion = aplicacion;
    }

    @Override
    public double obtenerVolumen() {
        return (Math.sqrt(2) * arista * arista * arista) / 12;
    }

    public double obtenerArea() {
        return Math.sqrt(3) * arista * arista;
    }

    public String obtenerAplicacion() {
        return aplicacion;
    }
}
