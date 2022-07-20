package org.ihanmarroquin.bean;

import java.util.Date;

//   codigoCuentasPorPagar INT Auto_Increment Not Null,
//    numeroFactura Varchar (45) Not Null,
//    fechaLimitePago Date Not Null,
//    estadoPago Varchar (45) Not Null,
//    valorNetoPago Double (10,2) Not Null,
//    codigoAdministracion INT Not Null,
//    codigoProveedor INT Not Null,

public class CuentaPorPagar {
    
    private int codigoCuentasPorPagar;
    private String numeroFactura;
    private Date fechaLimitePago;
    private String estadoPago;
    private double valorNetoPago;
    private int codigoAdministracion;
    private int codigoProveedor;

    public CuentaPorPagar() {
    }

    public CuentaPorPagar(int codigoCuentasPorPagar, String numeroFactura, Date fechaLimitePago, String estadoPago, double valorNetoPago, int codigoAdministracion, int codigoProveedor) {
        this.codigoCuentasPorPagar = codigoCuentasPorPagar;
        this.numeroFactura = numeroFactura;
        this.fechaLimitePago = fechaLimitePago;
        this.estadoPago = estadoPago;
        this.valorNetoPago = valorNetoPago;
        this.codigoAdministracion = codigoAdministracion;
        this.codigoProveedor = codigoProveedor;
    }

    public int getCodigoCuentasPorPagar() {
        return codigoCuentasPorPagar;
    }

    public void setCodigoCuentasPorPagar(int codigoCuentasPorPagar) {
        this.codigoCuentasPorPagar = codigoCuentasPorPagar;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFechaLimitePago() {
        return fechaLimitePago;
    }

    public void setFechaLimitePago(Date fechaLimitePago) {
        this.fechaLimitePago = fechaLimitePago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public double getValorNetoPago() {
        return valorNetoPago;
    }

    public void setValorNetoPago(double valorNetoPago) {
        this.valorNetoPago = valorNetoPago;
    }

    public int getCodigoAdministracion() {
        return codigoAdministracion;
    }

    public void setCodigoAdministracion(int codigoAdministracion) {
        this.codigoAdministracion = codigoAdministracion;
    }

    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }
    
    
    
}
