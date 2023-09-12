package mainFecha;

public class mainFecha {
    public static void main(String[] args) {
        System.out.println("-----PROGRAMA FECHA-----");
        Fecha fecha = new Fecha();
        fecha.leer();

        System.out.println("Fecha en formato corto: " + fecha.corta());
        System.out.println("Fecha en formato largo: " + fecha.larga());
        System.out.println("Día de la semana: " + fecha.diaSemana());
        System.out.println("Días transcurridos: " + fecha.diasTranscurridos());

        fecha.fechaFutura(10);
        System.out.println("Fecha futura: " + fecha.corta());

        Fecha copiaFecha = fecha.copia();
        System.out.println("Copia de la fecha: " + copiaFecha.corta());

        Fecha otraFecha = new Fecha(20, 8, 2023);
        System.out.println("¿Fecha es igual a otraFecha? " + Fecha.igualQue(fecha, otraFecha));
        System.out.println("¿Fecha es menor que otraFecha? " + Fecha.menorQue(fecha, otraFecha));
        System.out.println("¿Fecha es mayor que otraFecha? " + Fecha.mayorQue(fecha, otraFecha));

        fecha.siguiente();
        System.out.println("Fecha después de avanzar un día: " + fecha.corta());
        fecha.anterior();
        System.out.println("Fecha después de retroceder un día: " + fecha.corta());
        System.out.println("Días entre fecha y otraFecha: " + fecha.diasEntre(otraFecha));

        System.out.println("--------------------------------------");
    }
}
