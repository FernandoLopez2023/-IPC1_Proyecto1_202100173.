package proyectohospital;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DoctorInterface {
    public DoctorInterface() {
        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel citasPanel = new JPanel();
        citasPanel.setLayout(new BorderLayout());

        String[] columnasCitas = {"Nombre Paciente", "Hora Cita", "Fecha Cita", "Acciones"};
        DefaultTableModel modeloTablaCitas = new DefaultTableModel(columnasCitas, 0);
        JTable tablaCitas = new JTable(modeloTablaCitas);
        JScrollPane scrollPaneCitas = new JScrollPane(tablaCitas);

        citasPanel.add(scrollPaneCitas, BorderLayout.CENTER);

        tabbedPane.addTab("Citas", citasPanel);

        JPanel horarioPanel = new JPanel();
        horarioPanel.setLayout(new BorderLayout());

        JPanel horarioCitasPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel horarioCitasLabel = new JLabel("Horario de Citas:");
        JTextField horarioCitasTextField = new JTextField(10);
        JButton asignarButton = new JButton("Asignar");
        horarioCitasPanel.add(horarioCitasLabel);
        horarioCitasPanel.add(horarioCitasTextField);
        horarioCitasPanel.add(asignarButton);

        JPanel horarioDisponiblePanel = new JPanel(new BorderLayout());
        JLabel miHorarioLabel = new JLabel("Mi Horario Disponible");
        JPanel tablaHorarioPanel = new JPanel();
        tablaHorarioPanel.setLayout(new BorderLayout());
        String[] columnasHorario = {"No:", "Horario de Cita"};
        DefaultTableModel modeloTablaHorario = new DefaultTableModel(columnasHorario, 0);
        JTable tablaHorario = new JTable(modeloTablaHorario);
        JScrollPane scrollPaneHorario = new JScrollPane(tablaHorario);
        tablaHorarioPanel.add(scrollPaneHorario, BorderLayout.CENTER);
        horarioDisponiblePanel.add(miHorarioLabel, BorderLayout.NORTH);
        horarioDisponiblePanel.add(tablaHorarioPanel, BorderLayout.CENTER);

        horarioPanel.add(horarioCitasPanel, BorderLayout.NORTH);
        horarioPanel.add(horarioDisponiblePanel, BorderLayout.CENTER);

        tabbedPane.addTab("Asignar Horario", horarioPanel);

        frame.add(tabbedPane, BorderLayout.CENTER);

        JButton editarPerfilButton = new JButton("Editar Perfil");
        frame.add(editarPerfilButton, BorderLayout.NORTH);

        JButton cerrarSesionButton = new JButton("Cerrar Sesión");
        frame.add(cerrarSesionButton, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DoctorInterface();
            }
        });
    }
}
