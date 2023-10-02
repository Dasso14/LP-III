public class Automovil extends Motor {
    private String placa;
    private int numPuerta;
    private String marca;
    private String modelo;
    private Motor motor;

    public Automovil(int numMotor, int revPorMin, String placa, int numPuerta, String marca, String modelo,
            Motor motor) {
        super(numMotor, revPorMin);
        this.placa = placa;
        this.numPuerta = numPuerta;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPuerta() {
        return numPuerta;
    }

    public void setNumPuerta(int numPuerta) {
        this.numPuerta = numPuerta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Automovil [placa=" + placa + ", numPuerta=" + numPuerta + ", marca=" + marca + ", modelo=" + modelo
                + ", motor=" + motor + "]";
    }
}
