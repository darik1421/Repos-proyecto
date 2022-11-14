/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.*;
/**
 *
 * @author gonzalez
 */
public class Producto {
    private int cod_produc;
    private String descripcion;
    private float precio;
    private float unid_med;
    private float existencia;
    private String t_produc;

    public Producto(int cod_produc, String descripcion, float precio, float unid_med, float existencia, String t_produc) {
        this.cod_produc = cod_produc;
        this.descripcion = descripcion;
        this.precio = precio;
        this.unid_med = unid_med;
        this.existencia = existencia;
        this.t_produc = t_produc;
    }

    public Producto(String descripcion, float precio, float unid_med, float existencia, String t_produc) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.unid_med = unid_med;
        this.existencia = existencia;
        this.t_produc = t_produc;
    }

    public int getCod_produc() {
        return cod_produc;
    }

    public void setCod_produc(int cod_produc) {
        this.cod_produc = cod_produc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getUnid_med() {
        return unid_med;
    }

    public void setUnid_med(float unid_med) {
        this.unid_med = unid_med;
    }

    public float getExistencia() {
        return existencia;
    }

    public void setExistencia(float existencia) {
        this.existencia = existencia;
    }

    public String getT_produc() {
        return t_produc;
    }

    public void setT_produc(String t_produc) {
        this.t_produc = t_produc;
    }
    
}
