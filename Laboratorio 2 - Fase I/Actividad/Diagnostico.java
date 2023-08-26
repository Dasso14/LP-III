package Principal6;

public class Diagnostico {
    public void aptoVacunaA(Perro p1) {
        double temp = p1.getTemp();
        double peso = p1.getPeso();
        int edad = p1.getEdad();

        if (temp >= 37 && temp <= 40 && peso > 5 && edad > 1) {
            System.out.println("Perro SANO");
        } else {
            System.out.println("Perro ENFERMO");
        }
    }

    public void aptoVacunaB(Perro p1) {
        double temp = p1.getTemp();
        double peso = p1.getPeso();
        int edad = p1.getEdad();

        if (temp >= 37 && temp <= 40 && peso > 5 && edad > 1) {
            System.out.println("Perro SANO");
        } else {
            System.out.println("Perro ENFERMO");
        }
    }
}
