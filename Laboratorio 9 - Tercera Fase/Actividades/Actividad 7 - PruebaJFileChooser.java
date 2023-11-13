import java.io.IOException;
import javax.swing.JFrame;

public class PruebaJFileChooser {
    public static void main(String[] args) throws IOException {
        DemoFileChooser aplicacion = new DemoFileChooser();
        aplicacion.setSize(400, 400);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setVisible(true);
    }
}
