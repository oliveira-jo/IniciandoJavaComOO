package Cap10JavaLang;

public class GuardadorDeObjetos {
    
    private Object [] gdo;
    private int contObjetos;
            
    public GuardadorDeObjetos(int numDeObjetos){
        gdo = new Object[numDeObjetos];
        this.contObjetos = 0;
    }
    
    public void addObjeto(Object obj){
        this.gdo[contObjetos] = obj;
    }
    
    public Object getObj(int posi){
        return gdo[posi];
    }
    
}
