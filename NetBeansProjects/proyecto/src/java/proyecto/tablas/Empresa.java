package proyecto.tablas;
// Generated 27-04-2016 11:18:03 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.sql.Clob;
import java.util.HashSet;
import java.util.Set;

/**
 * Empresa generated by hbm2java
 */
public class Empresa  implements java.io.Serializable {


     private BigDecimal idEmpresa;
     private String nombre;
     private Clob direccion;
     private BigDecimal telefono;
     private Set clientes = new HashSet(0);
     private Set convenios = new HashSet(0);

    public Empresa() {
    }

	
    public Empresa(BigDecimal idEmpresa, String nombre, Clob direccion) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public Empresa(BigDecimal idEmpresa, String nombre, Clob direccion, BigDecimal telefono, Set clientes, Set convenios) {
       this.idEmpresa = idEmpresa;
       this.nombre = nombre;
       this.direccion = direccion;
       this.telefono = telefono;
       this.clientes = clientes;
       this.convenios = convenios;
    }
   
    public BigDecimal getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(BigDecimal idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Clob getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(Clob direccion) {
        this.direccion = direccion;
    }
    public BigDecimal getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(BigDecimal telefono) {
        this.telefono = telefono;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }
    public Set getConvenios() {
        return this.convenios;
    }
    
    public void setConvenios(Set convenios) {
        this.convenios = convenios;
    }




}


