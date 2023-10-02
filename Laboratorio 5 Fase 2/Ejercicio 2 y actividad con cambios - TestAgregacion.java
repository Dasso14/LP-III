public class TestAgregacion extends Automovil {

    public TestAgregacion(int numMotor, int revPorMin, String placa, int numPuerta, String marca, String modelo,
            Motor motor) {
        super(numMotor, revPorMin, placa, numPuerta, marca, modelo, motor);
    }

    public static void main(String[] args) {

        Automovil a1 = new Automovil(0, 0, null, 0, null, null, null);
        Motor m1 = new Motor(1, 6000);

        a1.setPlaca("A1-CDF");
        a1.setMarca("Toyota");
        a1.setModelo("T100");
        a1.setNumPuerta(4);
        a1.setMotor(m1);

        System.out.println(a1);
    }

    @Override
    public String toString() {
        return "TestAgregacion [placa=" + getPlaca() + ", numPuerta=" + getNumPuerta() + ", marca=" + getMarca()
                + ", modelo=" + getModelo() + ", motor=" + getMotor() + "]";
    }
}
