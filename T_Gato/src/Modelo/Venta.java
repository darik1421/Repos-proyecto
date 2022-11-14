/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;
/**
 *
 * @author gonzalez
 */
public class Venta {
    private int n_factura;
    private Date fecha_vent;
    private String descripcion;
    private int id_empleado;
    private int id_cliente;

    public Venta(int n_factura, Date fecha_vent, String descripcion, int id_empleado, int id_cliente) {
        this.n_factura = n_factura;
        this.fecha_vent = fecha_vent;
        this.descripcion = descripcion;
        this.id_empleado = id_empleado;
        this.id_cliente = id_cliente;
    }

    public Venta(Date fecha_vent, String descripcion, int id_empleado, int id_cliente) {
        this.fecha_vent = fecha_vent;
        this.descripcion = descripcion;
        this.id_empleado = id_empleado;
        this.id_cliente = id_cliente;
    }

    public int getN_factura() {
        return n_factura;
    }

    public void setN_factura(int n_factura) {
        this.n_factura = n_factura;
    }

    public Date getFecha_vent() {
        return fecha_vent;
    }

    public void setFecha_vent(Date fecha_vent) {
        this.fecha_vent = fecha_vent;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
   

}
