package proyectohospital;

import javax.swing.*;
import java.awt.*;

public class Actualizarproducto extends JFrame {
    
    public Actualizarproducto() {
        setTitle("Actualizar Producto");
        setSize(400, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(5, 2, 5, 5)); 
        
        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField();
        
        JLabel lblPrecio = new JLabel("Precio:");
        JTextField txtPrecio = new JTextField();
        
        JLabel lblDescripcion = new JLabel("Descripción:");
        JTextField txtDescripcion = new JTextField();
        
        JLabel lblCantidad = new JLabel("Cantidad:");
        JTextField txtCantidad = new JTextField();
        
        JButton btnActualizar = new JButton("Actualizar Producto");
        
        panelPrincipal.add(lblNombre);
        panelPrincipal.add(txtNombre);
        
        panelPrincipal.add(lblPrecio);
        panelPrincipal.add(txtPrecio);
        
        panelPrincipal.add(lblDescripcion);
        panelPrincipal.add(txtDescripcion);
        
        panelPrincipal.add(lblCantidad);
        panelPrincipal.add(txtCantidad);
        
        panelPrincipal.add(new JLabel()); 
        panelPrincipal.add(btnActualizar);
        
        add(panelPrincipal);
        
        btnActualizar.addActionListener(e -> {
            dispose(); 
            new Admin();
        });
        
        setVisible(true); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Actualizarproducto();
            }
        });
    }
}
