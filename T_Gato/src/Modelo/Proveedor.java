/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author gonzalez
 */
public class Proveedor {
    private int ruc;
    private String nomb_empresa;
    private String direccion;
    private String telefono;

    public Proveedor(int ruc, String nomb_empresa, String direccion, String telefono) {
        this.ruc = ruc;
        this.nomb_empresa = nomb_empresa;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Proveedor(String nomb_empresa, String direccion, String telefono) {
        this.nomb_empresa = nomb_empresa;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getNomb_empresa() {
        return nomb_empresa;
    }

    public void setNomb_empresa(String n_empresa) {
        this.nomb_empresa = n_empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
