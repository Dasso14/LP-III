package Principal6;

public class Perro {
    private String raza;
    private String color;
    private double temp;
    private int edad;
    private double peso;

    public Perro(String raza, String color, double temp, int edad) {
        this.raza = raza;
        this.color = color;
        this.temp = temp;
        this.edad = edad;
    }

    public Perro() {
        raza = "Pitbull";
        color = "Negro";
        temp = 20.5;
        edad = 10;
        peso = 7.5;
    }

    public Perro(String raza, String color, double temp, int edad, double peso) {
        this.raza = raza;
        this.color = color;
        this.temp = temp;
        this.edad = edad;
        this.peso = peso;
    }

    public void setRaza(String nraza) {
        raza = nraza;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Perro [raza=" + raza + ", color=" + color + ", temp=" + temp + ", edad=" + edad + ", peso=" + peso
                + "]";
    }

    public void ladrar() {
        System.out.println("Gua Gua");
    }

    public void dormir() {
        System.out.println("ZzzZzzZzz");
    }

    public void comer() {
        System.out.println("Nian Nian Nian");
    }

    private void cambiarPeso(int anios) {
        this.peso = this.peso + (anios * 0.5);
    }

    public void increEdad(int anios) {
        this.edad = this.edad + anios;
        cambiarPeso(anios);
    }
}
