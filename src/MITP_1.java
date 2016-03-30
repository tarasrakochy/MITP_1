
import javax.swing.SwingUtilities;



public class MITP_1 {

    public static void main(String[] args) throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        SwingUtilities.invokeLater(() -> {
            GUI gui = new GUI();
        });

    }

}
