/**
 * Lista actua como "Component" en el patron Composite puro.
 */
public interface Lista {
    /**
     * Metodo abstracto que deberan implementar las hojas.
     * @return String que representa html.
     */
    public String getHTML();
    public void agregar(Lista obj);

    public void eliminar(Lista obj);
}
