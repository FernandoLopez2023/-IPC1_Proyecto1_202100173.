package proyectohospital;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Autentificacion extends JFrame {
    private JLabel imagenLabel;
    private JLabel codigoLabel;
    private JTextField codigoTextField;
    private JLabel contraseñaLabel;
    private JPasswordField contraseñaField;
    private JButton registrarseButton;
    private JButton ingresarButton;

    public Autentificacion() {
        initComponents();
        setSize(500, 500);
        setTitle("Inicio de Sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        setLayout(null);

        ImageIcon imagenIcon = new ImageIcon(getClass().getResource("userpng.png"));

        ImageIcon imagenEscalada = new ImageIcon(imagenIcon.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
        imagenLabel = new JLabel(imagenEscalada);
        imagenLabel.setBounds(200, 10, 100, 100);
        add(imagenLabel);

        codigoLabel = new JLabel("Código:");
        codigoLabel.setBounds(50, 150, 80, 30);
        add(codigoLabel);

        codigoTextField = new JTextField();
        codigoTextField.setBounds(150, 150, 200, 30);
        add(codigoTextField);

        contraseñaLabel = new JLabel("Contraseña:");
        contraseñaLabel.setBounds(50, 200, 80, 30);
        add(contraseñaLabel);

        contraseñaField = new JPasswordField();
        contraseñaField.setBounds(150, 200, 200, 30);
        add(contraseñaField);

        registrarseButton = new JButton("Registrarse");
        registrarseButton.setBounds(100, 270, 120, 30);
        registrarseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registro registroVentana = new Registro();
                registroVentana.setVisible(true);
                dispose();
            }

        });
        add(registrarseButton);

        ingresarButton = new JButton("Ingresar");
        ingresarButton.setBounds(250, 270, 120, 30);
        ingresarButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String codigo = codigoTextField.getText();
        String contraseña = new String(contraseñaField.getPassword());

        if (codigo.equals("1") && contraseña.equals("1")) {
            DoctorInterface doctorVentana = new DoctorInterface();
            dispose();
        } else if (codigo.equals("2") && contraseña.equals("2")) {
            Modulopaciente pacienteVentana = new Modulopaciente();
            dispose();
        } else if (codigo.equals("202100173") && contraseña.equals("proyecto1ipc1")) {
            Admin adminVentana = new Admin();
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Código o contraseña incorrectos");
        }
    }
});

        add(ingresarButton);
    }

    public static void main(String[] args) {
        Autentificacion autentificacionVentana = new Autentificacion();
        autentificacionVentana.setVisible(true);
    }
}
