package proyectohospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Crearproducto {
    private Admin admin;
private int valor = 1;
    public Crearproducto(Admin admin) {
        this.admin = admin;

        JFrame frame = new JFrame("Crear Producto");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

        JLabel nombresLabel = new JLabel("Nombres:");
        JTextField nombresField = new JTextField(20);

        JLabel precioLabel = new JLabel("Precio:");
        JTextField precioField = new JTextField(20);

        JLabel descripcionLabel = new JLabel("Descripcion:");
        JTextField descripcionField = new JTextField(3);


        JLabel cantidadLabel = new JLabel("Cantidad:");
        JTextField cantidadField = new JTextField(20);

        JButton registrarButton = new JButton("Registrar Producto");

        registrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombres = nombresField.getText();
                String precio = precioField.getText();
                String descripcion = descripcionField.getText();
                String cantidad = cantidadField.getText();
                String codigooo = String.format("%07d", valor++);
                Producto producto = new Producto(nombres, precio, precio, cantidad, codigooo );
                admin.agregarProducto(producto);
JOptionPane.showMessageDialog(null, "Su código es: " + codigooo);
                nombresField.setText("");
                precioField.setText("");
                descripcionField.setText("");
                cantidadField.setText("");
            }
        });

        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(nombresLabel);
        panel.add(nombresField);
        panel.add(precioLabel);
        panel.add(precioField);
        panel.add(descripcionLabel);
        panel.add(descripcionField);
        panel.add(cantidadLabel);
        panel.add(cantidadField);
        panel.add(new JLabel());
        panel.add(registrarButton);

        frame.add(panel);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    Crearproducto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}