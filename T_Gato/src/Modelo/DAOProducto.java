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
public class DAOProducto {
    
    public Producto Insertar(String descripcion, float precio, float unid_med, float existencia, String t_produc){
        String transaccion = "INSERT INTO Producto VALUES('"
                + descripcion + "','"
                + precio + "','"
                + unid_med + "','"
                + existencia + "','"
                + t_produc + "')";
        
         if (new DataBase().Actualizar(transaccion) > 0){
            return new Producto(descripcion, precio, unid_med, existencia, t_produc);
        }
        return null; 
    }
    
    public int Actualizar(int cod_produc, String descripcion, float precio, float unid_med, float existencia, String t_produc){
        String transaccion = "UPDATE Producto SET descripcion='"
                + descripcion + "', precio='"
                + precio + "', unid_med='"
                + unid_med + "', existencia='"
                + existencia + "', t_produc='"
                + t_produc + "' WHERE cod_produc="
                + cod_produc;
          
        return new DataBase().Actualizar(transaccion);
    }
    
     public List obtenerDatos(){
       String transaccion = "SELECT * FROM Producto";
        
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Producto> productos = new ArrayList();
        
        for(Map registro : registros){
            Producto produc = new Producto((int) registro.get("cod_produc"),
                    (String) registro.get("descripcion"),
                    (float) registro.get("precio"),
                    (float) registro.get("unid_med"),
                    (float) registro.get("existencia"),
                    (String) registro.get("t_produc"));
            
            productos.add(produc);
        }
        return productos;
   }
   
   public int Eliminar(int cod_produc){
        String transaccion = "DELETE FROM Venta WHERE cod_produc='"+ cod_produc + "'";
        
        return new DataBase().Actualizar(transaccion);
   }
}
