public class TestComposicion{
    public static void main(String[]args){
        Persona p1 = new Persona(1, "Juan", "Perez");
        Persona p2 = new Persona(2, "Maria", "Fernandez");
        Persona p3 = new Persona(3, "Jose", "Domingo");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }

}
