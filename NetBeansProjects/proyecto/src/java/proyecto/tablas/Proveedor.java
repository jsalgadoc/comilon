package proyecto.tablas;
// Generated 27-04-2016 11:18:03 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.sql.Clob;
import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private BigDecimal idProveedor;
     private String nombre;
     private String direccion;
     private BigDecimal telefono;
     private Clob descripcion;
     private Set platos = new HashSet(0);

    public Proveedor() {
    }

	
    public Proveedor(BigDecimal idProveedor, String nombre, String direccion) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public Proveedor(BigDecimal idProveedor, String nombre, String direccion, BigDecimal telefono, Clob descripcion, Set platos) {
       this.idProveedor = idProveedor;
       this.nombre = nombre;
       this.direccion = direccion;
       this.telefono = telefono;
       this.descripcion = descripcion;
       this.platos = platos;
    }
   
    public BigDecimal getIdProveedor() {
        return this.idProveedor;
    }
    
    public void setIdProveedor(BigDecimal idProveedor) {
        this.idProveedor = idProveedor;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public BigDecimal getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(BigDecimal telefono) {
        this.telefono = telefono;
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


