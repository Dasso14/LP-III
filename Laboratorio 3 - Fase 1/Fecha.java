package mainFecha;

import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this(1, 1, 1900);
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
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

    private void valida() {
        if (anio < 1900) {
            anio = 1900;
        } else if (anio > 2050) {
            anio = 1900;
        }

        if (mes < 1) {
            mes = 1;
        } else if (mes > 12) {
            mes = 1;
        }

        int maxDias = diasMes(mes);
        if (dia < 1) {
            dia = 1;
        } else if (dia > maxDias) {
            dia = 1;
        }
    }

    public void leer() {
        try (Scanner s1 = new Scanner(System.in)) {
            System.out.print("Ingrese el día (1-31): ");
            dia = s1.nextInt();
            System.out.print("Ingrese el mes (1-12): ");
            mes = s1.nextInt();
            System.out.print("Ingrese el año (1900-2050): ");
            anio = s1.nextInt();
            valida();
        }
    }

    public boolean bisiesto(int y) {
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int diasMes(int mes) {
        switch (mes) {
            case 2:
                return bisiesto(mes) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public String corta() {
        return String.format("%02d-%02d-%04d", dia, mes, anio);
    }

    public int diasTranscurridos() {
        int totalDias = 0;

        for (int y = 1900; y < anio; y++) {
            totalDias += bisiesto(y) ? 366 : 365;
        }

        for (int m = 1; m < mes; m++) {
            totalDias += diasMes(m);
        }

        totalDias += dia - 1;

        return totalDias;
    }

    public int diaSemana() {
        int m = mes;
        int y = anio;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int K = y % 100;
        int J = y / 100;
        int h = (dia + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + (5 * J)) % 7;
        return (h + 6) % 7;
    }

    public String larga() {
        String[] nombresDias = { "domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado" };
        String[] nombresMeses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
                "septiembre", "octubre", "noviembre", "diciembre" };

        String nombreMes = nombresMeses[mes - 1];

        return nombresDias[diaSemana()] + " " + dia + " de " + nombreMes + " de " + anio;
    }

    public void fechaTras(long dias) {
        int totalDias = diasTranscurridos() + (int) dias;

        int y = 1900;
        while (totalDias >= (bisiesto(y) ? 366 : 365)) {
            totalDias -= bisiesto(y) ? 366 : 365;
            y++;
        }

        int m = 1;
        while (totalDias >= diasMes(m)) {
            totalDias -= diasMes(m);
            m++;
        }

        dia = totalDias + 1;
        mes = m;
        anio = y;
    }

    public int diasEntre(Fecha otraFecha) {
        int diasFecha1 = this.diasTranscurridos();
        int diasFecha2 = otraFecha.diasTranscurridos();

        return Math.abs(diasFecha1 - diasFecha2);
    }

    public void siguiente() {
        int maxDias = diasMes(mes);

        if (dia < maxDias) {
            dia++;
        } else {
            dia = 1;
            if (mes < 12) {
                mes++;
            } else {
                mes = 1;
                anio++;
            }
        }
    }

    public void anterior() {
        if (dia > 1) {
            dia--;
        } else {
            if (mes > 1) {
                mes--;
                dia = diasMes(mes);
            } else {
                mes = 12;
                dia = 31;
                anio--;
            }
        }
    }

    public void fechaFutura(long dias) {
        fechaTras(dias);
    }

    public Fecha copia() {
        return new Fecha(dia, mes, anio);
    }

    public static boolean igualQue(Fecha fecha1, Fecha fecha2) {
        return fecha1.dia == fecha2.dia && fecha1.mes == fecha2.mes && fecha1.anio == fecha2.anio;
    }

    public static boolean menorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.anio < fecha2.anio) {
            return true;
        } else if (fecha1.anio == fecha2.anio) {
            if (fecha1.mes < fecha2.mes) {
                return true;
            } else if (fecha1.mes == fecha2.mes) {
                return fecha1.dia < fecha2.dia;
            }
        }
        return false;
    }

    public static boolean mayorQue(Fecha fecha1, Fecha fecha2) {
        return !igualQue(fecha1, fecha2) && !menorQue(fecha1, fecha2);
    }

    @Override
    public String toString() {
        return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
    }

}
