package Principal3;

public class PerfilMedico {
    private String primerNom;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int anio;
    private double altura;
    private double peso;

    public PerfilMedico(String primerNom, String apellido,
            String sexo, double altura, double peso, int anio,
            int mes, int dia) {
        this.altura = altura;
        this.apellido = apellido;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.peso = peso;
        this.primerNom = primerNom;
        this.sexo = sexo;
    }

    public String getPrimerNom() {
        return primerNom;
    }

    public void setPrimerNom(String primerNom) {
        this.primerNom = primerNom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Perfil Medico [Nombres: " + primerNom + ", Apellidos: " + apellido +
                ", Sexo: " + sexo + ", Fecha de nacimiento: " + dia + "/" + mes + "/" + anio +
                ", Altura: " + altura + "m" + ", Peso: " + peso + "kg " + "]";
    }

    public void calEdad() {
        this.anio = 2023 - this.anio;
    }

    public void FMC(double m1) {
        m1 = 208 - 0.7 * this.getAnio();
        System.out.println("Tu FMC es de: " + m1);
    }

    public void IMC(double m2) {
        m2 = this.getPeso() / this.getAltura();
        System.out.println("Tu IMC es de: " + m2);
    }
}
