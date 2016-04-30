package proyecto.tablas;
// Generated 27-04-2016 11:18:03 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.sql.Clob;
import java.util.Date;

/**
 * Convenio generated by hbm2java
 */
public class Convenio  implements java.io.Serializable {


     private BigDecimal idConvenio;
     private Empresa empresa;
     private String nombreConvenio;
     private Clob descripcion;
     private Date fechaContrato;
     private Date fechaCaducacion;
     private BigDecimal saldoTrabajador;

    public Convenio() {
    }

	
    public Convenio(BigDecimal idConvenio, Empresa empresa, Date fechaContrato, Date fechaCaducacion, BigDecimal saldoTrabajador) {
        this.idConvenio = idConvenio;
        this.empresa = empresa;
        this.fechaContrato = fechaContrato;
        this.fechaCaducacion = fechaCaducacion;
        this.saldoTrabajador = saldoTrabajador;
    }
    public Convenio(BigDecimal idConvenio, Empresa empresa, String nombreConvenio, Clob descripcion, Date fechaContrato, Date fechaCaducacion, BigDecimal saldoTrabajador) {
       this.idConvenio = idConvenio;
       this.empresa = empresa;
       this.nombreConvenio = nombreConvenio;
       this.descripcion = descripcion;
       this.fechaContrato = fechaContrato;
       this.fechaCaducacion = fechaCaducacion;
       this.saldoTrabajador = saldoTrabajador;
    }
   
    public BigDecimal getIdConvenio() {
        return this.idConvenio;
    }
    
    public void setIdConvenio(BigDecimal idConvenio) {
        this.idConvenio = idConvenio;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getNombreConvenio() {
        return this.nombreConvenio;
    }
    
    public void setNombreConvenio(String nombreConvenio) {
        this.nombreConvenio = nombreConvenio;
    }
    public Clob getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(Clob descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaContrato() {
        return this.fechaContrato;
    }
    
    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
    public Date getFechaCaducacion() {
        return this.fechaCaducacion;
    }
    
    public void setFechaCaducacion(Date fechaCaducacion) {
        this.fechaCaducacion = fechaCaducacion;
    }
    public BigDecimal getSaldoTrabajador() {
        return this.saldoTrabajador;
    }
    
    public void setSaldoTrabajador(BigDecimal saldoTrabajador) {
        this.saldoTrabajador = saldoTrabajador;
    }




}


