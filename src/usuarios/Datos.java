package usuarios;

import java.util.ArrayList;
import java.util.Arrays;
import usuarios.enums.Categoria;
import usuarios.enums.Clase;

abstract public class Datos {

    protected String nombre, apellido, email;
    protected int telefono, dni;

    public Datos(String nombre, String apellido, String email, int telefono, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
    }
    
    public abstract Clase getClase();
    public abstract Categoria getCategoria();
    
    
    public ArrayList getAll(){ 
        ArrayList datos = new ArrayList(Arrays.asList(nombre, apellido, email, telefono, dni));
        return datos;
    }
}
