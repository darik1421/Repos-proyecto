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
public class Empleado {
    private int id_empl;
    private String cedula;
    private String nombres;
    private String apellidos;
    private Date fecha_nac;
    private String direccion;
    private char sexo;
    private String celular;

    public Empleado(int id_empl, String cedula, String nombres, String apellidos, Date fecha_nac, String direccion, char sexo, String celular) {
        this.id_empl = id_empl;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_nac = fecha_nac;
        this.direccion = direccion;
        this.sexo = sexo;
        this.celular = celular;
    }

    public Empleado(String cedula, String nombres, String apellidos, Date fecha_nac, String direccion, char sexo, String celular) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_nac = fecha_nac;
        this.direccion = direccion;
        this.sexo = sexo;
        this.celular = celular;
    }

    public int getId_empl() {
        return id_empl;
    }

    public void setId_empl(int id_empl) {
        this.id_empl = id_empl;
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
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
