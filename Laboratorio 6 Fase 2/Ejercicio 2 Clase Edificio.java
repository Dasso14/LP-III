package Ejercicio;

class Edificio implements ImpactoEcologico {
    private double consumoEnergético;
    private double emisionesCO2;

    public Edificio(double consumoEnergético, double emisionesCO2) {
        this.consumoEnergético = consumoEnergético;
        this.emisionesCO2 = emisionesCO2;
    }

    public double obtenerImpactoEcologico() {
        return (emisionesCO2 * 1000) / consumoEnergético;
    }
}
