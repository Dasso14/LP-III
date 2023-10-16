public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[6];
        figuras[0] = new Circulo("Círculo", 5, "verde");
        figuras[1] = new Triangulo("Triángulo", 8, 4);
        figuras[2] = new Cuadrado("Cuadrado", 6);
        figuras[3] = new Esfera("Esfera", 3);
        figuras[4] = new Cubo("Cubo", 4);
        figuras[5] = new Tetraedo("Tetraedo", 5, "Matematica");

        for (Figura figura : figuras) {
            if (figura instanceof FiguraBidimensional) {
                System.out.println("Figura bidimensional " + figura.obtenerNombre() + " con área: " + ((FiguraBidimensional) figura).obtenerArea());
                if (figura instanceof Circulo) {
                    System.out.println("Color del círculo: " + ((Circulo) figura).obtenerColor());
                }
            } else if (figura instanceof FiguraTridimensional) {
                System.out.println("Figura tridimensional " + figura.obtenerNombre() + " con volumen: " + ((FiguraTridimensional) figura).obtenerVolumen() +
                " con área de: "+((FiguraTridimensional) figura).obtenerArea());
                if (figura instanceof Tetraedo) {
                    System.out.println("Aplicación del tetraedo: " + ((Tetraedo) figura).obtenerAplicacion());
                }
            }
        }
    }
}
