package proyectohospital;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Crearpac {
    private Admin admin;
    private int valor = 1;

    public Crearpac(Admin admin) {
        this.admin = admin;

        JFrame frame = new JFrame("Crear Paciente");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

        JLabel nombresLabel = new JLabel("Nombres:");
        JTextField nombresField = new JTextField(20);

        JLabel apellidosLabel = new JLabel("Apellidos:");
        JTextField apellidosField = new JTextField(20);

        JLabel edadLabel = new JLabel("Edad:");
        JTextField edadField = new JTextField(3);

        JLabel sexoLabel = new JLabel("Sexo:");
        JComboBox<String> sexoComboBox = new JComboBox<>(new String[]{"M", "F"});

        JLabel contraseñaLabel = new JLabel("Contraseña:");
        JPasswordField contraseñaField = new JPasswordField(20);

        JButton registrarButton = new JButton("Registrar Paciente");

        registrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombres = nombresField.getText();
                String apellidos = apellidosField.getText();
                String edad = edadField.getText();
                String sexo = (String) sexoComboBox.getSelectedItem();
                String contraseña = new String(contraseñaField.getPassword());
                
                String codigoo = String.format("%07d", valor++);

                Paciente paciente = new Paciente(nombres, apellidos, contraseña, edad, sexo, codigoo);
                admin.agregarPaciente(paciente);
                JOptionPane.showMessageDialog(null, "Su código es: " + codigoo);
                nombresField.setText("");
                apellidosField.setText("");
                edadField.setText("");
                sexoComboBox.setSelectedIndex(0);
                contraseñaField.setText("");
            }
        });

        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(nombresLabel);
        panel.add(nombresField);
        panel.add(apellidosLabel);
        panel.add(apellidosField);
        panel.add(edadLabel);
        panel.add(edadField);
        panel.add(sexoLabel);
        panel.add(sexoComboBox);
        panel.add(contraseñaLabel);
        panel.add(contraseñaField);
        panel.add(new JLabel());
        panel.add(registrarButton);

        frame.add(panel);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}

