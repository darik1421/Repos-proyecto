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
public class DAOVenta {
    
    public Venta Insertar(java.sql.Date fecha_vent, String descripcion, int id_empleado, int id_cliente){
        String transaccion = "INSERT INTO Venta VALUES('"
                + fecha_vent + "','"
                + descripcion + "','"
                + id_empleado + "','"
                + id_cliente + "')";
        
        if (new DataBase().Actualizar(transaccion) > 0){
            return new Venta(fecha_vent, descripcion, id_empleado, id_cliente);
        }
        return null;        
    }
    
    public int Actualizar(int n_factura, java.sql.Date fecha_vent, String descripcion, int id_empleado,int id_cliente){
        String transaccion = "UPDATE Venta SET descripcion='"
                + descripcion + "', id_empleado='"
                + id_empleado + "', id_cliente='"
                + id_cliente + "', fecha_vent='"
                + fecha_vent + "' WHERE n_factura="
                + n_factura;
        
        return new DataBase().Actualizar(transaccion);
    }
    
   public List obtenerDatos(){
       String transaccion = "SELECT * FROM Venta";
        
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Venta> ventas = new ArrayList();
        
        for(Map registro : registros){
            Venta vent = new Venta((int) registro.get("n_factura"),
                    (java.sql.Date) registro.get("fecha_vent"),
                    (String) registro.get("descripcion"),
                    (int) registro.get("id_empleado"),
                    (int) registro.get("id_cliente"));
                    
            
            ventas.add(vent);
        }
        return ventas;
   }
   
   public int Eliminar(int n_factura){
        String transaccion = "DELETE FROM Venta WHERE n_factura='"+ n_factura + "'";
        
        return new DataBase().Actualizar(transaccion);
   }
}
