package entity;

import java.util.Date;

public class Persona {
    private int id;
    private String nombre; 
    private String apellido; 
    private String direccion;
    private Date fechaNacimiento;
    private Date fechaDeFunciono;    
    private String eps;
    private String pension;
    private Date fechaDeAfiliacion;
    private String tipoCotizante;
    private String regimen;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String direccion, Date fechaNacimiento, Date fechaDeFunciono, String eps, String pension, Date fechaDeAfiliacion, String tipoCotizante, String regimen) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDeFunciono = fechaDeFunciono;
        this.eps = eps;
        this.pension = pension;
        this.fechaDeAfiliacion = fechaDeAfiliacion;
        this.tipoCotizante = tipoCotizante;
        this.regimen = regimen;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the fechaDeFunciono
     */
    public Date getFechaDeFunciono() {
        return fechaDeFunciono;
    }

    /**
     * @param fechaDeFunciono the fechaDeFunciono to set
     */
    public void setFechaDeFunciono(Date fechaDeFunciono) {
        this.fechaDeFunciono = fechaDeFunciono;
    }

    /**
     * @return the eps
     */
    public String getEps() {
        return eps;
    }

    /**
     * @param eps the eps to set
     */
    public void setEps(String eps) {
        this.eps = eps;
    }

    /**
     * @return the pension
     */
    public String getPension() {
        return pension;
    }

    /**
     * @param pension the pension to set
     */
    public void setPension(String pension) {
        this.pension = pension;
    }

    /**
     * @return the fechaDeAfiliacion
     */
    public Date getFechaDeAfiliacion() {
        return fechaDeAfiliacion;
    }

    /**
     * @param fechaDeAfiliacion the fechaDeAfiliacion to set
     */
    public void setFechaDeAfiliacion(Date fechaDeAfiliacion) {
        this.fechaDeAfiliacion = fechaDeAfiliacion;
    }

    /**
     * @return the tipoCotizante
     */
    public String getTipoCotizante() {
        return tipoCotizante;
    }

    /**
     * @param tipoCotizante the tipoCotizante to set
     */
    public void setTipoCotizante(String tipoCotizante) {
        this.tipoCotizante = tipoCotizante;
    }

    /**
     * @return the regimen
     */
    public String getRegimen() {
        return regimen;
    }

    /**
     * @param regimen the regimen to set
     */
    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }
    
    
}
