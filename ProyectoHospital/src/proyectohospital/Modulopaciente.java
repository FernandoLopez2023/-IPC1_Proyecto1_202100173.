package proyectohospital;
import javax.swing.*;

public class Modulopaciente {
    public Modulopaciente() {
        JFrame frame = new JFrame("Paciente");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Interfaz de Paciente");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Modulopaciente();
            }
        });
    }
}
