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
public class Cliente {
    private int id_cli;
    private String cedula;
    private String nombres;
    private String Apellidos;
    private Date fecha_nac;
    private String direccion;
    private char sexo;
    private String celular;

    public Cliente(int id_cli, String cedula, String nombres, String Apellidos, Date fecha_nac, String direccion, char sexo, String celular) {
        this.id_cli = id_cli;
        this.cedula = cedula;
        this.nombres = nombres;
        this.Apellidos = Apellidos;
        this.fecha_nac = fecha_nac;
        this.direccion = direccion;
        this.sexo = sexo;
        this.celular = celular;
    }

    public Cliente(String cedula, String nombres, String Apellidos, Date fecha_nac, String direccion, char sexo, String celular) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.Apellidos = Apellidos;
        this.fecha_nac = fecha_nac;
        this.direccion = direccion;
        this.sexo = sexo;
        this.celular = celular;
    }

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
}
