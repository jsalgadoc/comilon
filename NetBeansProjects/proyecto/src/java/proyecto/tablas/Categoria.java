package proyecto.tablas;
// Generated 27-04-2016 11:18:03 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.sql.Clob;
import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private BigDecimal idCategoria;
     private String nombre;
     private Clob descripcion;
     private Set platos = new HashSet(0);

    public Categoria() {
    }

	
    public Categoria(BigDecimal idCategoria, String nombre) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
    }
    public Categoria(BigDecimal idCategoria, String nombre, Clob descripcion, Set platos) {
       this.idCategoria = idCategoria;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.platos = platos;
    }
   
    public BigDecimal getIdCategoria() {
        return this.idCategoria;
    }
    
    public void setIdCategoria(BigDecimal idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
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


