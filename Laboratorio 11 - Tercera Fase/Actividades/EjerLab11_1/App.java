package EjerLab11_1;

public class App {
    public static void main(String[] args) {
        Persona[] personas = { new Persona("Juan", "Direccion 1", "1234567890"),
                new Persona("Maria", "Direccion 2", "0987654321") };
        Verificadora<Persona> verificadoraPersonas = new Verificadora<>(personas);
        boolean contienePersona = verificadoraPersonas.contiene(new Persona("Juan", "Direccion 1", "1234567890"));
        System.out.println("El arreglo de personas contiene la persona: " + contienePersona);

        Goodies[] goodies = { new Goodies(1, "Descripcion 1", 10.0f),
                new Goodies(2, "Descripcion 2", 20.0f) };
        Verificadora<Goodies> verificadoraGoodies = new Verificadora<>(goodies);
        boolean contieneGoodies = verificadoraGoodies.contiene(new Goodies(1, "Descripcion 1", 10.0f));
        System.out.println("El arreglo de goodies contiene el goodie: " + contieneGoodies);

        Estudiante[] estudiantes = {
                new Estudiante("Pedro", "Direccion 3", "0987654321", "Especialidad 1",
                        new Procedencia("Departamento 1", "Provincia 1")),
                new Estudiante("Ana", "Direccion 4", "1234567890", "Especialidad 2",
                        new Procedencia("Departamento 2", "Provincia 2")) };
        Verificadora<Estudiante> verificadoraEstudiantes = new Verificadora<>(estudiantes);
        boolean contieneEstudiante = verificadoraEstudiantes.contiene(new Estudiante("Pedro", "Direccion 3",
                "0987654321", "Especialidad 1", new Procedencia("Departamento 1", "Provincia 1")));
        System.out.println("El arreglo de estudiantes contiene el estudiante: " + contieneEstudiante);
    }
}

class Persona {
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Persona persona = (Persona) obj;
        return nombre.equals(persona.nombre);
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + "]";
    }
}

class Goodies {
    @Override
    public String toString() {
        return "Goodies [id=" + id + ", description=" + description + ", price=" + price + "]";
    }

    private int id;
    private String description;
    private double price;

    public Goodies(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Goodies goodies = (Goodies) obj;
        return id == goodies.id;
    }
}

class Procedencia {
    private String departamento;
    private String provincia;

    public Procedencia(String departamento, String provincia) {
        this.departamento = departamento;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Procedencia [departamento=" + departamento + ", provincia=" + provincia + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Procedencia other = (Procedencia) obj;
        return departamento.equals(other.departamento) && provincia.equals(other.provincia);
    }
}

class Estudiante extends Persona {
    @Override
    public String toString() {
        return "Estudiante [especialidad=" + especialidad + ", procedencia=" + procedencia + "]";
    }

    private String especialidad;
    private Procedencia procedencia;

    public Estudiante(String nombre, String direccion, String telefono, String especialidad, Procedencia procedencia) {
        super(nombre, direccion, telefono);
        this.especialidad = especialidad;
        this.procedencia = procedencia;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Estudiante other = (Estudiante) obj;
        return especialidad.equals(other.especialidad) && procedencia.equals(other.procedencia);
    }

}