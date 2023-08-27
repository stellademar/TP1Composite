package composite;

import java.util.List;

public class ListaCompuesta implements Lista {
    
    protected List <Lista> objs;
    private String titulo;
    
    public ListaCompuesta(List<Lista> unaListaObjs, String unTitulo) {
        this.objs = unaListaObjs;
        this.titulo = unTitulo;
    }
    
    @Override
    public String getHTML() {
        String html = "";
        html += this.titulo +"\n<ul>\n";
        
        for (Lista elem : objs) {
            html += "\t<li> ";
            html += elem.getHTML();
            html += "</li> \n";
        }
        
        html += "</ul> \n";
        return html;
    }
    
    public void add(Lista unObj) {
        objs.add(unObj);
    }
    
    public void remove(Lista unObj) {
        objs.remove(unObj);
    }
}
