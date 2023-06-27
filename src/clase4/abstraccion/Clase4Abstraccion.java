package clase4.abstraccion;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import usuarios.Admins;
import usuarios.Usuario;
import usuarios.enums.Categoria;
import usuarios.enums.Clase;
import usuarios.interfaces.Perfil;

public class Clase4Abstraccion {

    public static void main(String[] args) {

        // Listas enlazadas
        
        LinkedList enlazado = new LinkedList();
        
        enlazado.add("Pedro");
        enlazado.add(23);
        enlazado.add(true);
        enlazado.add(23);
        enlazado.add(null);
        
        System.out.println(enlazado.getFirst());
        System.out.println(enlazado.getLast());
        System.out.println(enlazado.get(2));
        
        enlazado.remove(); // Se borra Pedro
        System.out.println(enlazado);
        
        enlazado.remove(1);
        System.out.println(enlazado);
        
        
        
        // HashSet
        
        HashSet set1 = new HashSet();
        
        set1.add("Hola");
        set1.add(1);
        set1.add(2.35);
        set1.add(true);
        set1.add("Hola");
        set1.add(2.35);
        
        for(Object item: set1)
            System.out.println("For: " + item);
        
        System.out.println(set1 + " " + set1.size());
        
        
        
        // ABSTRACCION
        
        Usuario user1 = new Usuario("Juan", "Mendez", "juanm@mail.com", 1511111234, 123123123, Clase.Intermedio, Categoria.B);
        
        System.out.println(user1.getNombre());
        System.out.println(user1.getApellido());
        System.out.println(user1.getClase());
        System.out.println(user1.getCategoria());
        System.out.println(user1.getCategoria().getLeyenda());
        System.out.println(user1.getCategoria().getMonto());
        user1.perfilStatus();
        
        Admins admin1 = new Admins("Admin", "Admin", "nada", 123, 123);
        
        
        
        
        
        
        
    }

}
