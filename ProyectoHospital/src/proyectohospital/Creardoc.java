package proyectohospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Creardoc {
    private Admin admin;
    private int valor = 1;

    public Creardoc(Admin admin) {
        this.admin = admin;

        JFrame frame = new JFrame("Crear Doctor");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel nombreLabel = new JLabel("Nombre:");
        JTextField nombreField = new JTextField(20);

        JLabel apellidosLabel = new JLabel("Apellidos:");
        JTextField apellidosField = new JTextField(20);

        JLabel contraseñaLabel = new JLabel("Contraseña:");
        JPasswordField contraseñaField = new JPasswordField(20);

        JLabel especialidadLabel = new JLabel("Especialidad:");
        JTextField especialidadField = new JTextField(20);

        JLabel telefonoLabel = new JLabel("Teléfono:");
        JTextField telefonoField = new JTextField(20);

        JLabel edadLabel = new JLabel("Edad:");
        JTextField edadField = new JTextField(20);

        JButton registrarButton = new JButton("Registrar Doctor");

        registrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                String apellidos = apellidosField.getText();
                String contraseña = new String(contraseñaField.getPassword());
                String especialidad = especialidadField.getText();
                String telefono = telefonoField.getText();
                String edad = edadField.getText();

                String codigo = String.format("%07d", valor++);

                Doctor doctor = new Doctor(nombre, apellidos, contraseña, especialidad, telefono, edad, codigo);

                admin.agregarDoctor(doctor);

                JOptionPane.showMessageDialog(null, "Su código es: " + codigo);

                nombreField.setText("");
                apellidosField.setText("");
                contraseñaField.setText("");
                especialidadField.setText("");
                telefonoField.setText("");
                edadField.setText("");
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));
        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(apellidosLabel);
        panel.add(apellidosField);
        panel.add(contraseñaLabel);
        panel.add(contraseñaField);
        panel.add(especialidadLabel);
        panel.add(especialidadField);
        panel.add(telefonoLabel);
        panel.add(telefonoField);
        panel.add(edadLabel);
        panel.add(edadField);
        panel.add(new JLabel());
        panel.add(registrarButton);

        frame.add(panel);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}

