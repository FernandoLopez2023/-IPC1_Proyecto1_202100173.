package proyectohospital;

public class Doctor {
    private String nombre;
    private String apellidos;
    private String contraseña;
    private String especialidad;
    private String telefono;
    private String edad;
    private String codigo;

    public Doctor(String nombre, String apellidos, String contraseña, String especialidad, String telefono, String edad, String codigo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.edad = edad;
        this.codigo = codigo;
    }
    public String getCodigo(){
    return codigo;
    }
    public void setCodigo(String codigo){
    this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    
}
