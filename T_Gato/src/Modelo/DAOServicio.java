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
public class DAOServicio {
    
    public Servicio Insertar(String descripcion, java.sql.Date fecha_serv, float precio, int id_empleado){
        String transaccion = "INSERT INTO Servicio VALUES('"
                + descripcion + "','"
                + fecha_serv + "','"
                + precio + "','"
                + id_empleado + "')";
        
        if(new DataBase().Actualizar(transaccion) > 0){
            return new Servicio(descripcion,fecha_serv,precio,id_empleado);
        }
        return null;
    }
    
    public int Actualizar(int cod_serv, String descripcion, java.sql.Date fecha_serv, float precio, int id_empleado){
        String transaccion = "UPDATE Servicio SET descripcion='"
                + descripcion + "', fecha_serv='"
                + fecha_serv + "', precio='"
                + precio + "', cod_serv="
                + cod_serv+"' WHERE id_empleado"
                + id_empleado;
        return new DataBase().Actualizar(transaccion);
    }
    
    public List obtenerDatos(){
        String transaccion = "SELECT * FROM Servicio";
        
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Servicio> servicios = new ArrayList();
        
        for(Map registro : registros){
            Servicio serv = new Servicio((int) registro.get("cod_serv"),
                    (String) registro.get("descripcion"),
                    (java.sql.Date) registro.get("fecha_serv"),
                    (float) registro.get("precio"),
                    (int) registro.get("id_empleado"));
            
            servicios.add(serv);
    }
        return servicios;
    }
    
    public int Eliminar(int cod_serv){
        String transaccion = "DELETE FROM Servicio WHERE cod_serv='"+ cod_serv + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
