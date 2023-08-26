package Principal3;

import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) {
        PerfilMedico pm1 = new PerfilMedico(null, null, null,
                0, 0, 0, 0, 0);

        try (Scanner s1 = new Scanner(System.in)) {
            System.out.println("-----PERFIL MEDICO-----");
            System.out.println("Ingresa sus nombres: ");
            String nomb = s1.nextLine();
            System.out.println("Ingrese sus apellidos: ");
            String apell = s1.nextLine();
            System.out.println("Ingrese su sexo: ");
            String sex = s1.nextLine();
            System.out.println("Ingrese su altura: ");
            double al = s1.nextDouble();
            System.out.println("Ingrese su peso: ");
            double pe = s1.nextDouble();
            System.out.println("Ingrese su fecha de nacimiento...");
            System.out.println("Dia: ");
            int dia = s1.nextInt();
            System.out.println("Mes: ");
            int mes = s1.nextInt();
            System.out.println("Año: ");
            int anio = s1.nextInt();

            pm1.setPrimerNom(nomb);
            pm1.setApellido(apell);
            pm1.setSexo(sex);
            pm1.setAltura(al);
            pm1.setPeso(pe);
            pm1.setDia(dia);
            pm1.setMes(mes);
            pm1.setAnio(anio);

            System.out.println("Perfil medico: " + pm1);

            pm1.calEdad();
            System.out.println("Su edad es: " + pm1.getAnio() + " años");
            pm1.FMC(anio);
            pm1.IMC(pe);
        }
    }
}
