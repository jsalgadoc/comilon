package Model;
// Generated 27-04-2016 11:18:03 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Venta generated by hbm2java
 */
public class Venta  implements java.io.Serializable {


     private BigDecimal idVenta;
     private Despacho despacho;
     private Pedido pedido;
     private Date fecha;
     private BigDecimal total;
     private Set despachos = new HashSet(0);

    public Venta() {
    }

	
    public Venta(BigDecimal idVenta, Pedido pedido, Date fecha, BigDecimal total) {
        this.idVenta = idVenta;
        this.pedido = pedido;
        this.fecha = fecha;
        this.total = total;
    }
    public Venta(BigDecimal idVenta, Despacho despacho, Pedido pedido, Date fecha, BigDecimal total, Set despachos) {
       this.idVenta = idVenta;
       this.despacho = despacho;
       this.pedido = pedido;
       this.fecha = fecha;
       this.total = total;
       this.despachos = despachos;
    }
   
    public BigDecimal getIdVenta() {
        return this.idVenta;
    }
    
    public void setIdVenta(BigDecimal idVenta) {
        this.idVenta = idVenta;
    }
    public Despacho getDespacho() {
        return this.despacho;
    }
    
    public void setDespacho(Despacho despacho) {
        this.despacho = despacho;
    }
    public Pedido getPedido() {
        return this.pedido;
    }
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public BigDecimal getTotal() {
        return this.total;
    }
    
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    public Set getDespachos() {
        return this.despachos;
    }
    
    public void setDespachos(Set despachos) {
        this.despachos = despachos;
    }




}

