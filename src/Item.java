package composite;

public class Item implements Lista {
    
    private String texto;
    
    public Item(String unTxt) {
        this.texto = unTxt;
    }
    
    @Override
    public String getHTML() {
        return this.texto;
    }
    
}
