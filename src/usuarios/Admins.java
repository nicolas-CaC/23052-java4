package usuarios;

import usuarios.enums.Categoria;
import usuarios.enums.Clase;
import usuarios.interfaces.Perfil;

public class Admins extends Datos implements Perfil{

    public Admins(String nombre, String apellido, String email, int telefono, int dni) {
        super(nombre, apellido, email, telefono, dni);
    }

    @Override
    public Clase getClase() {
        return Clase.A;
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.A;
    }

    @Override
    public String getNombre() {
        return "Es Admin";
    }

    @Override
    public String getApellido() {
        return "Es Admin";
    }

}
