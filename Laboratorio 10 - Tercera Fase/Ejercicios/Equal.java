public class Equal {

    public static <T> boolean isEqualTo(T obj1, T obj2) {
        if (obj1 == null && obj2 == null) {
            return true;
        }
        if (obj1 == null || obj2 == null) {
            return false;
        }
        return obj1.equals(obj2);
    }

    public static void main(String[] args) {

        String str1 = "Hola";
        String str2 = "Hola";
        System.out.println("Strings iguales: " + isEqualTo(str1, str2));

        Integer int1 = 42;
        Integer int2 = 42;
        System.out.println("Integers iguales: " + isEqualTo(int1, int2));

        Double double1 = 3.14;
        Double double2 = 3.14;
        System.out.println("Doubles iguales: " + isEqualTo(double1, double2));

        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("Objetos iguales: " + isEqualTo(obj1, obj2));
    }
}
