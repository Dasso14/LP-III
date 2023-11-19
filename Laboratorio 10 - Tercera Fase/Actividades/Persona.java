public class Persona {
    String dni;
        String nombres;
        String direccion;

        public Persona(String dni, String nombres, String direccion) {
            this.dni = dni;
            this.nombres = nombres;
            this.direccion = direccion;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "dni='" + dni + '\'' +
                    ", nombres='" + nombres + '\'' +
                    ", direccion='" + direccion + '\'' +
                    '}';
        }
}
