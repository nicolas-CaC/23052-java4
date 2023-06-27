package usuarios.interfaces;

public interface Perfil {

    public String getNombre();
    public String getApellido();
    
    default public void perfilStatus(){
        System.out.println("Tenemos métodos de nombres y apellidos");
    }
}
