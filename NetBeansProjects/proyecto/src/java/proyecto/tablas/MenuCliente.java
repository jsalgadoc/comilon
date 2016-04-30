package proyecto.tablas;
// Generated 27-04-2016 11:18:03 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.sql.Clob;
import java.util.HashSet;
import java.util.Set;

/**
 * MenuCliente generated by hbm2java
 */
public class MenuCliente  implements java.io.Serializable {


     private BigDecimal idMenuCliente;
     private Cliente cliente;
     private String tipo;
     private Clob descripcion;
     private Set platos = new HashSet(0);

    public MenuCliente() {
    }

	
    public MenuCliente(BigDecimal idMenuCliente, Cliente cliente) {
        this.idMenuCliente = idMenuCliente;
        this.cliente = cliente;
    }
    public MenuCliente(BigDecimal idMenuCliente, Cliente cliente, String tipo, Clob descripcion, Set platos) {
       this.idMenuCliente = idMenuCliente;
       this.cliente = cliente;
       this.tipo = tipo;
       this.descripcion = descripcion;
       this.platos = platos;
    }
   
    public BigDecimal getIdMenuCliente() {
        return this.idMenuCliente;
    }
    
    public void setIdMenuCliente(BigDecimal idMenuCliente) {
        this.idMenuCliente = idMenuCliente;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Clob getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(Clob descripcion) {
        this.descripcion = descripcion;
    }
    public Set getPlatos() {
        return this.platos;
    }
    
    public void setPlatos(Set platos) {
        this.platos = platos;
    }




}


