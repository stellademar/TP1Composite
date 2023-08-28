import java.util.List;

/**
 * Representa el componente "Composite" en el patron puro.
 * Es el elemento que se compone de otros y hace los llamados recursivos.
 */
public class ListaCompuesta implements Lista {
    /**
     * Pense dos cosas, en primer lugar se me ocurrio tener 2 tipo composite,
     * pero eso no respeta el patron puro, asi que me parecio optimo agregar un atributo tag,al igual que marcadores
     * eso para un futuro.
     */
    
    protected List <Lista> objs;
    private String titulo;
    private String tag;
    private String marcador;
    
    public ListaCompuesta(List<Lista> unaListaObjs, String unTitulo) {
        this.objs = unaListaObjs;
        this.titulo = unTitulo;
    }
    
    @Override
    public String getHTML() {
        String html = "";
        html += this.titulo +"\n<ul>\n";

        for (Lista elem : objs) {
            html += "\t<li>\n"+identarEtiquetas(elem.getHTML())+"\t</li>\n";
        }
        html += "</ul> \n";
        return html;
    }

    private String identarEtiquetas(String html) {
        //El metodo split divide un string en varios substrings que yo le indique.
        String[] arregloLineas = html.split("\n");
        String formateado = "";
        for (String linea : arregloLineas) {
            formateado+="\t\t"+linea+"\n";
        }
        return formateado;
    }

    /**
     * Agrega un elemento a la lista de Listas.
     * @param unaLista lista:puede hoja o lista compuesta.
     */
    public void agregar(Lista unaLista) {
        objs.add(unaLista);
    }

    /**
     * Elimina un elemento(compuesto o no) a la lista de Listas.
     * @param unaLista lista:puede hoja o lista compuesta.
     */
    public void eliminar(Lista unaLista) {
        objs.remove(unaLista);
    }

    public ListaCompuesta get(){
        return this;
    }
}
