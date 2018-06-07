package boletin32;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Producto {
    private String referenciaProducto, nombreProducto, referenciaPrecio;

    public Producto(){
    }

    public Producto(String referenciaProducto, String nombreProducto, String referenciaPrecio){
        this.referenciaProducto=referenciaProducto;
        this.nombreProducto=nombreProducto;
        this.referenciaPrecio=referenciaPrecio;
    }

    public String getReferenciaProducto(){
        return referenciaProducto;
    }

    public void setReferenciaProducto(String referenciaProducto){
        this.referenciaProducto=referenciaProducto;
    }

    public String getNombreProducto(){
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto){
        this.nombreProducto=nombreProducto;
    }

    public String getReferenciaPrecio(){
        return referenciaPrecio;
    }

    public void setReferenciaPrecio(String referenciaPrecio){
        this.referenciaPrecio=referenciaPrecio;
    }

    @Override
    public String toString(){
        return "Producto{"+"referenciaProducto="+referenciaProducto+", nombreProducto="+nombreProducto+", referenciaPrecio="+referenciaPrecio+'}';
    }

}
