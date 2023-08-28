public class Item implements Lista {
    
    private String texto;
    
    public Item(String unTxt) {
        this.texto = unTxt;
    }
    
    @Override
    public String getHTML() {
        return texto;
    }

    //no los implementa xq es hoja
    @Override
    public void agregar(Lista obj) {

    }

    //no los implementa xq es hoja
    @Override
    public void eliminar(Lista obj) {

    }

}
