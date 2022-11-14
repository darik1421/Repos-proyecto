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
public class Servicio {
    private int cod_serv;
    private String descripcion;
    private Date fecha_serv;
    private float precio;
    private int id_empleado;

    public Servicio(int cod_serv, String descripcion, Date fecha_serv, float precio, int id_empleado) {
        this.cod_serv = cod_serv;
        this.descripcion = descripcion;
        this.fecha_serv = fecha_serv;
        this.precio = precio;
        this.id_empleado = id_empleado;
    }

    public Servicio(String descripcion, Date fecha_serv, float precio, int id_empleado) {
        this.descripcion = descripcion;
        this.fecha_serv = fecha_serv;
        this.precio = precio;
        this.id_empleado = id_empleado;
    }

    public int getCod_serv() {
        return cod_serv;
    }

    public void setCod_serv(int cod_serv) {
        this.cod_serv = cod_serv;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_serv() {
        return fecha_serv;
    }

    public void setFecha_serv(Date fecha_serv) {
        this.fecha_serv = fecha_serv;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }
    

   
}
