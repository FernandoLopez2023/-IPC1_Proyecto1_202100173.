package proyectohospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actualizardoc {
    public Actualizardoc() {
        JFrame frame = new JFrame("Actualizar Doctor");
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

        JLabel codigoLabel = new JLabel("Código:");
        JTextField codigoField = new JTextField(20);

        JLabel nombresLabel = new JLabel("Nombres:");
        JTextField nombresField = new JTextField(20);

        JLabel apellidosLabel = new JLabel("Apellidos:");
        JTextField apellidosField = new JTextField(20);

        JLabel contraseñaLabel = new JLabel("Contraseña:");
        JPasswordField contraseñaField = new JPasswordField(20);

        JLabel especialidadLabel = new JLabel("Especialidad:");
        JTextField especialidadField = new JTextField(20);

        JLabel telefonoLabel = new JLabel("Teléfono:");
        JTextField telefonoField = new JTextField(20);

        JLabel generoLabel = new JLabel("Género:");
        JRadioButton masculinoRadio = new JRadioButton("Masculino");
        JRadioButton femeninoRadio = new JRadioButton("Femenino");
        ButtonGroup generoGroup = new ButtonGroup();
        generoGroup.add(masculinoRadio);
        generoGroup.add(femeninoRadio);

        JLabel edadLabel = new JLabel("Edad:");
        JTextField edadField = new JTextField(20);

        JButton actualizarButton = new JButton("Actualizar");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panel.add(codigoLabel);
        panel.add(codigoField);
        panel.add(nombresLabel);
        panel.add(nombresField);
        panel.add(apellidosLabel);
        panel.add(apellidosField);
        panel.add(contraseñaLabel);
        panel.add(contraseñaField);
        panel.add(especialidadLabel);
        panel.add(especialidadField);
        panel.add(telefonoLabel);
        panel.add(telefonoField);
        panel.add(generoLabel);
        panel.add(masculinoRadio);
        panel.add(new JLabel());
        panel.add(femeninoRadio);
        panel.add(edadLabel);
        panel.add(edadField);
        panel.add(new JLabel()); 
        panel.add(actualizarButton);

        codigoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        nombresLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        apellidosLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contraseñaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        especialidadLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        telefonoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        generoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        edadLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                
                new Admin();
            }
        });

        frame.add(panel);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
