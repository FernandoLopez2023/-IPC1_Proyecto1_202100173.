package proyectohospital;

public class Paciente {
    private String nombre;
    private String apellido;
    private String edad;
    private String contraseña;
    private String codigoo; 

    public Paciente(String nombre, String apellido, String contraseña, String edad, String codigo, String codigoo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.edad = edad;
        this.codigoo = codigoo; 
    }

    public String getCodigoo() {
        return codigoo;
    }

    public void setCodigoo(String codigo) {
        this.codigoo = codigoo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellidos) {
        this.apellido = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
