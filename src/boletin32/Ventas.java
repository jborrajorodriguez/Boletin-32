package boletin32;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Ventas {
    
    private String numeroVenta, referenciaProducto;
    private float cantidad;

    public Ventas(){
    }

    public Ventas(String numeroVenta, String referenciaProducto, float cantidad){
        this.numeroVenta=numeroVenta;
        this.referenciaProducto=referenciaProducto;
        this.cantidad=cantidad;
    }

    public String getNumeroVenta(){
        return numeroVenta;
    }

    public void setNumeroVenta(String numeroVenta){
        this.numeroVenta=numeroVenta;
    }

    public String getReferenciaProducto(){
        return referenciaProducto;
    }

    public void setReferenciaProducto(String referenciaProducto){
        this.referenciaProducto=referenciaProducto;
    }

    public float getCantidade(){
        return cantidad;
    }

    public void setCantidade(float cantidade){
        this.cantidad=cantidade;
    }

    @Override
    public String toString(){
        return "Ventas{"+"numeroVenta="+numeroVenta+", referenciaProducto="+referenciaProducto+", cantidade="+cantidad+'}';
    }

}
