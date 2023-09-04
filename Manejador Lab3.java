public class Manejadorrect {
    public static void main(String[] args) {
        // Crear instancias de Coordenada
        Coordenada c1 = new Coordenada(1, 2);
        Coordenada c2 = new Coordenada(4, 6);

        // Calcular la distancia entre dos coordenadas
        double distancia = Coordenada.distancia(c1, c2);
        System.out.println("Distancia entre c1 y c2: " + distancia);

        // Crear un rectángulo utilizando las coordenadas
        Rectangulo rectangulo = new Rectangulo(c1, c2);

        // Mostrar información del rectángulo
        System.out.println(rectangulo);

        // Calcular el área y el perímetro del rectángulo
        double area = area(rectangulo);
        double perimetro = perimetro(rectangulo);

        System.out.println("Área del rectángulo: " + area);
        System.out.println("Perímetro del rectángulo: " + perimetro);

        // Mover el rectángulo en el eje X y en el eje Y
        moverX(rectangulo, 2);
        moverY(rectangulo, 3);

        // Mostrar la nueva posición del rectángulo
        System.out.println("Nueva posición del rectángulo: " + rectangulo);
    }

    // Método para calcular el área de un rectángulo
    public static double area(Rectangulo rectangulo) {
        Coordenada esquina1 = rectangulo.getEsquina1();
        Coordenada esquina2 = rectangulo.getEsquina2();
        double base = Math.abs(esquina2.getX() - esquina1.getX());
        double altura = Math.abs(esquina2.getY() - esquina1.getY());
        return base * altura;
    }

    // Método para calcular el perímetro de un rectángulo
    public static double perimetro(Rectangulo rectangulo) {
        Coordenada esquina1 = rectangulo.getEsquina1();
        Coordenada esquina2 = rectangulo.getEsquina2();
        double base = Math.abs(esquina2.getX() - esquina1.getX());
        double altura = Math.abs(esquina2.getY() - esquina1.getY());
        return 2 * (base + altura);
    }

    // Método para desplazar un rectángulo en el eje X
    public static void moverX(Rectangulo rectangulo, int puntos) {
        Coordenada esquina1 = rectangulo.getEsquina1();
        Coordenada esquina2 = rectangulo.getEsquina2();
        esquina1.setX(esquina1.getX() + puntos);
        esquina2.setX(esquina2.getX() + puntos);
    }

    // Método para desplazar un rectángulo en el eje Y
    public static void moverY(Rectangulo rectangulo, int puntos) {
        Coordenada esquina1 = rectangulo.getEsquina1();
        Coordenada esquina2 = rectangulo.getEsquina2();
        esquina1.setY(esquina1.getY() + puntos);
        esquina2.setY(esquina2.getY() + puntos);
    }
}
