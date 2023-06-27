package usuarios;

import usuarios.enums.Categoria;
import usuarios.enums.Clase;
import usuarios.interfaces.Contacto;
import usuarios.interfaces.Perfil;

public class Usuario extends Datos implements Contacto, Perfil {

    Clase clase;
    Categoria categoria;
    
    public Usuario(String nombre, String apellido, String email, int telefono, int dni, Clase clase, Categoria categoria) {
        super(nombre, apellido, email, telefono, dni);
        this.clase = clase;
        this.categoria = categoria;
    }


    @Override
    public Clase getClase() {
        return clase;
    }

    @Override
    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String getMail() {
        return email;
    }

    @Override
    public int getTelefono() {
        return telefono;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    
    
}
