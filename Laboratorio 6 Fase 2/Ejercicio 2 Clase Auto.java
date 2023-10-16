package Ejercicio;

class Auto implements ImpactoEcologico {
    private double emisionesCO2;
    private double distanciaRecorrida;

    public Auto(double emisionesCO2, double distanciaRecorrida) {
        this.emisionesCO2 = emisionesCO2;
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public double obtenerImpactoEcologico() {
        return (emisionesCO2 * 1000) / distanciaRecorrida;
    }
}
