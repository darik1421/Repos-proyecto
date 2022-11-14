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
public class Compra {
    private int cod_comp;
    private String descripcion;
    private Date fecha_comp;
    private String nomb_empresa;

    public Compra(int cod_comp, String descripcion, Date fecha_comp, String nomb_empresa) {
        this.cod_comp = cod_comp;
        this.descripcion = descripcion;
        this.fecha_comp = fecha_comp;
        this.nomb_empresa = nomb_empresa;
    }

    public Compra(String descripcion, Date fecha_comp, String nomb_empresa) {
        this.descripcion = descripcion;
        this.fecha_comp = fecha_comp;
        this.nomb_empresa = nomb_empresa;
    }

    public int getCod_comp() {
        return cod_comp;
    }

    public void setCod_comp(int cod_comp) {
        this.cod_comp = cod_comp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_comp() {
        return fecha_comp;
    }

    public void setFecha_comp(Date fecha_comp) {
        this.fecha_comp = fecha_comp;
    }

    public String getNomb_empresa() {
        return nomb_empresa;
    }

    public void setN_empresa(String nomb_empresa) {
        this.nomb_empresa = nomb_empresa;
    }

   
}
