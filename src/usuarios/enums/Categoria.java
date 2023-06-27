package usuarios.enums;


public enum Categoria {
    
    A("Categoria A", 10000), 
    B("Categoria B", 5000), 
    C("Categoria C", 2000);
    
    private String leyenda;
    private int monto;

    private Categoria(String leyenda, int monto) {
        this.leyenda = leyenda;
        this.monto = monto;
    }
    
    public String getLeyenda(){
        return leyenda;
    }
    
    public int getMonto(){
        return monto;
    }
    
    
}
