package proyectohospital;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Admin {
    private JFrame frame;
    public ArrayList<Doctor> listaDoctores = new ArrayList<>();
    private ArrayList<Paciente> listaPacientes = new ArrayList<>();
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    private JTable doctorTable;
    private JTable pacienteTable;
    private JTable productoTable;
    private int codigoCounter = 1; 

    public Admin() {
        frame = new JFrame();
        frame.setSize(900, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("ADMINISTRADOR", SwingConstants.CENTER);
        titlePanel.add(titleLabel);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel doctorPanel = new JPanel(new BorderLayout());
        JPanel patientsPanel = new JPanel(new BorderLayout());
        JPanel productsPanel = new JPanel(new BorderLayout());

        String[] columnNamesDoctors = {"Nombre", "Apellidos", "Contraseña", "Especialidad", "Teléfono", "Edad", "Código"};
        DefaultTableModel doctorTableModel = new DefaultTableModel(columnNamesDoctors, 0);
        doctorTable = new JTable(doctorTableModel);

        JScrollPane doctorScrollPane = new JScrollPane(doctorTable);
        doctorPanel.add(doctorScrollPane, BorderLayout.CENTER);

        JPanel doctorButtonPanel = new JPanel();
        doctorButtonPanel.setLayout(new BoxLayout(doctorButtonPanel, BoxLayout.Y_AXIS));

        JButton crearDoctorButton = new JButton("Crear Doctor");
        JButton actualizarDoctorButton = new JButton("Actualizar Doctor");
        JButton eliminarDoctorButton = new JButton("Eliminar Doctor");

        doctorButtonPanel.add(Box.createVerticalStrut(10));
        doctorButtonPanel.add(crearDoctorButton);
        doctorButtonPanel.add(actualizarDoctorButton);
        doctorButtonPanel.add(Box.createVerticalStrut(10));
        doctorButtonPanel.add(eliminarDoctorButton);

        doctorPanel.add(doctorButtonPanel, BorderLayout.EAST);

        String[] columnNamesPacientes = {"Nombres", "Apellidos", "Edad", "Sexo", "Contraseña", "Codigo"};
        DefaultTableModel pacienteTableModel = new DefaultTableModel(columnNamesPacientes, 0);
        pacienteTable = new JTable(pacienteTableModel);

        JScrollPane pacienteScrollPane = new JScrollPane(pacienteTable);
        patientsPanel.add(pacienteScrollPane, BorderLayout.CENTER);

        JPanel pacienteButtonPanel = new JPanel();
        pacienteButtonPanel.setLayout(new BoxLayout(pacienteButtonPanel, BoxLayout.Y_AXIS));

        JButton crearPacienteButton = new JButton("Crear Paciente");
        JButton actualizarPacienteButton = new JButton("Actualizar Paciente");
        JButton eliminarPacienteButton = new JButton("Eliminar Paciente");

        crearPacienteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Crearpac(Admin.this);
            }
        });

        actualizarPacienteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Actualizarpac();
            }
        });

        pacienteButtonPanel.add(crearPacienteButton);
        pacienteButtonPanel.add(actualizarPacienteButton);
        pacienteButtonPanel.add(eliminarPacienteButton);

        patientsPanel.add(pacienteButtonPanel, BorderLayout.EAST);

        String[] columnNamesProductos = {"Nombre", "Precio", "Descripción", "Cantidad", "Codigo"};
        DefaultTableModel productoTableModel = new DefaultTableModel(columnNamesProductos, 0);
        productoTable = new JTable(productoTableModel);

        JScrollPane productoScrollPane = new JScrollPane(productoTable);
        productsPanel.add(productoScrollPane, BorderLayout.CENTER);

        JPanel productoButtonPanel = new JPanel();
        productoButtonPanel.setLayout(new BoxLayout(productoButtonPanel, BoxLayout.Y_AXIS));

        JButton crearProductoButton = new JButton("Crear Producto");
        JButton actualizarProductoButton = new JButton("Actualizar Producto");
        JButton eliminarProductoButton = new JButton("Eliminar Producto");

        crearProductoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Crearproducto(Admin.this);
            }
        });

        productoButtonPanel.add(crearProductoButton);
        productoButtonPanel.add(actualizarProductoButton);
        productoButtonPanel.add(eliminarProductoButton);

        productsPanel.add(productoButtonPanel, BorderLayout.EAST);

        tabbedPane.addTab("Doctor", doctorPanel);
        tabbedPane.addTab("Pacientes", patientsPanel);
        tabbedPane.addTab("Productos", productsPanel);

        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(tabbedPane, BorderLayout.CENTER);

        JButton cerrarSesionButton = new JButton("Cerrar Sesión");
        cerrarSesionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Autentificacion autentificacion = new Autentificacion();
                autentificacion.setVisible(true);
            }
        });
        frame.add(cerrarSesionButton, BorderLayout.SOUTH);

        frame.setVisible(true);

        crearDoctorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new
Creardoc(Admin.this);
            }
        });

        actualizarDoctorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Actualizardoc();
            }
        });

        actualizarProductoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Actualizarproducto();
            }
        });

        eliminarProductoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        frame.setVisible(true);
    }

    private String generarCodigo() {
        String codigo = String.format("%07d", codigoCounter++);
        return codigo;
    }

    public void agregarDoctor(Doctor doctor) {
        doctor.setCodigo(generarCodigo());
        listaDoctores.add(doctor);
        updateDoctorTable();
    }

    public void agregarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
        updatePacienteTable();
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto); 
        updateProductoTable(); 
    }

    private void updateDoctorTable() {
        DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();
        model.setRowCount(0);
        for (Doctor doctor : listaDoctores) {
            model.addRow(new Object[]{doctor.getNombre(), doctor.getApellidos(), doctor.getContraseña(),
                    doctor.getEspecialidad(), doctor.getTelefono(), doctor.getEdad(), doctor.getCodigo()});
        }
    }

    private void updatePacienteTable() {
        DefaultTableModel model = (DefaultTableModel) pacienteTable.getModel();
        model.setRowCount(0);
        for (Paciente paciente : listaPacientes) {
            model.addRow(new Object[]{paciente.getNombre(), paciente.getApellido(), paciente.getEdad(),
                     paciente.getContraseña(), paciente.getCodigoo()});
        }
    }

    private void updateProductoTable() {
        DefaultTableModel model = (DefaultTableModel) productoTable.getModel();
        model.setRowCount(0);
        for (Producto producto : listaProductos) {
            model.addRow(new Object[]{producto.getNombre(), producto.getPrecio(), producto.getDescripcion(),
                    producto.getCantidad(), producto.getCodigooo()});
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Admin();
            }
        });
        
    }

    
  
}
