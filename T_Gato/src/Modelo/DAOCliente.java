/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;
import java.util.*;
/**
 *
 * @author gonzalez
 */
public class DAOCliente {
        
    public Cliente Insertar(String cedula, String nombres,String apellidos, java.sql.Date fecha_nac,String direccion, char sexo,String celular){
        String transaccion = "INSERT INTO Cliente VALUES('"
                + nombres + "','"
                + apellidos + "','"
                + fecha_nac + "','"
                + cedula + "','"
                + direccion + "','"
                + sexo + "','"
                + celular + "')";
        
        if (new DataBase().Actualizar(transaccion) > 0){
            return new Cliente(cedula, nombres, apellidos, fecha_nac, direccion, sexo, celular);
        }
        
        return null;
    }
    
    public int Actualizar (int id, String cedula, String nombres, String apellidos, java.sql.Date fecha_nac, String direccion, char sexo, String celular){
        String transaccion ="UPDATE Cliente SET nombres='"
                + nombres + "', apellidos='"
                + apellidos + "', fecha_nac='"
                + fecha_nac + "'cedula='"
                + cedula + "', sexo='"
                + sexo + "', celular='"
                + celular + "'WHERE id_cli="
                + id;
        return new DataBase().Actualizar(transaccion);
    }
    
    public List obtenerDatos(){
        String transaccion = "SELECT * FROM Cliente";
        
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Cliente> clientes = new ArrayList();
        
        for (Map registro : registros){
            Cliente cli = new Cliente((int) registro.get("id_cli"),
            (String) registro.get("nombres"),
            (String) registro.get("apellidos"),
            (String) registro.get("cedula"),
            (java.sql.Date) registro.get("fecha_nac"),
            (String) registro.get("direccion"),
            (char) registro.get("sexo"),
            (String) registro.get("celular"));
            
            clientes.add(cli);
        }
        return clientes;
    }
    
    public int Eliminar(int id){
        String transaccion = "DELETE FROM Cliente WHERE id_cli='+ id +"
                + "'";
        return new DataBase().Actualizar(transaccion);
    }
}
