package EjerciciosLab7;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// Excepción de vocal
class VocalException extends Exception {
    public VocalException(String message) {
        super(message);
    }
}

// Excepción de número
class NumeroException extends Exception {
    public NumeroException(String message) {
        super(message);
    }
}

// Excepción de blanco
class BlancoException extends Exception {
    public BlancoException(String message) {
        super(message);
    }
}

// Excepción de salida
class SalidaException extends Exception {
    public SalidaException(String message) {
        super(message);
    }
}

// Clase LeerEntrada
public class LeerEntrada {
    private Reader stream;

    public LeerEntrada(InputStream Fuente) {
        stream = new InputStreamReader(Fuente);
    }

    public char getChar() throws IOException {
        return (char) this.stream.read();
    }
    public static void main(String[] args) {
        LeerEntrada lector = new LeerEntrada(System.in);

        try {
            while (true) {
                char c = lector.getChar();
                try {
                    procesar(c);
                } catch (VocalException ve) {
                    System.out.println("Excepción de vocal: " + ve.getMessage());
                } catch (NumeroException ne) {
                    System.out.println("Excepción de número: " + ne.getMessage());
                } catch (BlancoException be) {
                    System.out.println("Excepción de blanco: " + be.getMessage());
                } catch (SalidaException se) {
                    System.out.println("Excepción de salida: " + se.getMessage());
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Error de lectura: " + e.getMessage());
        }
    }

    public static void procesar(char c) throws VocalException, NumeroException, BlancoException, SalidaException {
        if (Character.isLetter(c)) {
            if ("AEIOUaeiou".indexOf(c) >= 0) {
                throw new VocalException("Caracter es una vocal");
            }
        } else if (Character.isDigit(c)) {
            throw new NumeroException("Caracter es un número");
        } else if (Character.isWhitespace(c)) {
            throw new BlancoException("Caracter es un espacio en blanco");
        } else if (c == 'q' || c == 'Q') {
            throw new SalidaException("Caracter de salida detectado");
        }
    }

    @Override
    public String toString() {
        return "Main []";
    }
}

