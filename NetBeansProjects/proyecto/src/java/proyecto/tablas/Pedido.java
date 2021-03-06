package proyecto.tablas;
// Generated 27-04-2016 11:18:03 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pedido generated by hbm2java
 */
public class Pedido  implements java.io.Serializable {


     private BigDecimal idPedido;
     private Cliente cliente;
     private TipoPedido tipoPedido;
     private Date fechaEntrega;
     private Set ventas = new HashSet(0);
     private Set platos = new HashSet(0);
     private Set despachos = new HashSet(0);

    public Pedido() {
    }

	
    public Pedido(BigDecimal idPedido, Cliente cliente, TipoPedido tipoPedido) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.tipoPedido = tipoPedido;
    }
    public Pedido(BigDecimal idPedido, Cliente cliente, TipoPedido tipoPedido, Date fechaEntrega, Set ventas, Set platos, Set despachos) {
       this.idPedido = idPedido;
       this.cliente = cliente;
       this.tipoPedido = tipoPedido;
       this.fechaEntrega = fechaEntrega;
       this.ventas = ventas;
       this.platos = platos;
       this.despachos = despachos;
    }
   
    public BigDecimal getIdPedido() {
        return this.idPedido;
    }
    
    public void setIdPedido(BigDecimal idPedido) {
        this.idPedido = idPedido;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public TipoPedido getTipoPedido() {
        return this.tipoPedido;
    }
    
    public void setTipoPedido(TipoPedido tipoPedido) {
        this.tipoPedido = tipoPedido;
    }
    public Date getFechaEntrega() {
        return this.fechaEntrega;
    }
    
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public Set getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set ventas) {
        this.ventas = ventas;
    }
    public Set getPlatos() {
        return this.platos;
    }
    
    public void setPlatos(Set platos) {
        this.platos = platos;
    }
    public Set getDespachos() {
        return this.despachos;
    }
    
    public void setDespachos(Set despachos) {
        this.despachos = despachos;
    }




}


