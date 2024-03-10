
package proyectohospital;

public class Registrardoctor {
    private char nombre;
    private char apellido;
    private char contraseña;
    private char especialidad;
    private int telefono;
    private int edad;

    public Registrardoctor(char nombre, char apellido, char contraseña, char especialidad, int telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.edad = edad;    
}

    public char getNombre() {
        return nombre;
    }

    public char getApellido() {
        return apellido;
    }

    public char getContraseña() {
        return contraseña;
    }

    public char getEspecialidad() {
        return especialidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getEdad(){
    return edad;
    }

}
