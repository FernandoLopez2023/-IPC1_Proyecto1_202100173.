package proyectohospital;

public class Producto {
    private String nombre;
    private String precio;
    private String descripcion;
    private String cantidad;
    private String codigooo;
    
    public Producto(String nombre, String precio, String precio3, String cantidad,String codigoo) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.codigooo = codigooo; 

}
    
    public String getCodigooo() {
        return codigooo;
    }

    public void setCodigooo(String codigo) {
        this.codigooo = codigooo;
    }
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


   

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String edad) {
        this.cantidad = cantidad;
    }
    
}
