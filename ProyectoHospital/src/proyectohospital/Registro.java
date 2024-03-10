package proyectohospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registro extends JFrame {

    public Registro() {
        setTitle("Registro de Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(7, 2, 5, 5)); 

        add(new JLabel("Nombres:"));
        JTextField nombresTextField = new JTextField();
        add(nombresTextField);

        add(new JLabel("Apellidos:"));
        JTextField apellidosTextField = new JTextField();
        add(apellidosTextField);

        add(new JLabel("Contraseña:"));
        JPasswordField contraseñaField = new JPasswordField();
        add(contraseñaField);

        add(new JLabel("Género:"));
        String[] opcionesGenero = {"M", "F"};
        JComboBox<String> generoComboBox = new JComboBox<>(opcionesGenero);
        add(generoComboBox);

        add(new JLabel("Edad:"));
        JTextField edadTextField = new JTextField();
        add(edadTextField);

        JButton registrarButton = new JButton("Registrar");
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombres = nombresTextField.getText();
                String apellidos = apellidosTextField.getText();
                String contraseña = new String(contraseñaField.getPassword());
                String genero = (String) generoComboBox.getSelectedItem();
                String edad = edadTextField.getText();
                System.out.println("Registrando: " + nombres + " " + apellidos + ", Contraseña: " + contraseña + ", Género: " + genero + ", Edad: " + edad);
                redirectToAuthentificacion();
            }
        });
        add(registrarButton);

        JButton volverButton = new JButton("Volver al inicio");
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                redirectToAuthentificacion();
            }
        });
        add(volverButton);

        setVisible(true);
    }

    private void redirectToAuthentificacion() {
        Autentificacion autentificacion = new Autentificacion();
        autentificacion.setVisible(true);
        dispose(); 
    }
}
