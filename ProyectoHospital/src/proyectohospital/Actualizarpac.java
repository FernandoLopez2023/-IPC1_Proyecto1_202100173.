package proyectohospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actualizarpac {
    public Actualizarpac() {
        JFrame frame = new JFrame("Actualizar Paciente");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

        JLabel nombresLabel = new JLabel("Nombres:");
        JTextField nombresField = new JTextField(20);

        JLabel apellidosLabel = new JLabel("Apellidos:");
        JTextField apellidosField = new JTextField(20);

        JLabel contraseñaLabel = new JLabel("Contraseña:");
        JPasswordField contraseñaField = new JPasswordField(20);

        JButton actualizarButton = new JButton("Actualizando Paciente");

        actualizarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Admin();
            }
        });

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(nombresLabel);
        panel.add(nombresField);
        panel.add(apellidosLabel);
        panel.add(apellidosField);
        panel.add(contraseñaLabel);
        panel.add(contraseñaField);
        panel.add(new JLabel()); 
        panel.add(actualizarButton);

        frame.add(panel);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
