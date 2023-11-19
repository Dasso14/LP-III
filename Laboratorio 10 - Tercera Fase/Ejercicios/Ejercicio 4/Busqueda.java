package EjerMetodosGenericos;
class Busqueda {
    public static <T> int buscarElemento(T[] arreglo, T elementoBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(elementoBuscado)) {
                return i;
            }
        }
        return -1; 
    }
}

