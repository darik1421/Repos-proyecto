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
public class DAOProveedor {
    
    public Proveedor Insertar(String nomb_empresa, String direccion, String telefono){
        String transaccion = "INSERT INTO Proveedor VALUES)'"
                + nomb_empresa + "','"
                + direccion + "','"
                + telefono + "')";
        
        if (new DataBase().Actualizar(transaccion) > 0){
            return new Proveedor(nomb_empresa, direccion, telefono);
    }
        return null;
    }
    
    public int Actualizar(int ruc, String nomb_empresa, String direccion, String telefono){
        String transaccion = "UPDATE Proveedor SET nomb_empresa='"
                + nomb_empresa + "', direccion='"
                + direccion + "', telefono='"
                + telefono + "', WHERE ruc="
                + ruc;
        return new DataBase().Actualizar(transaccion);          
    }
    
    public List obtenerDatos(){
        String transaccion = "SELECT * FROM Proveedor";
        
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Proveedor> proveedores = new ArrayList();
        
        for (Map registro : registros){
            Proveedor prov = new Proveedor((int) registro.get("ruc"),
                    (String) registro.get("nomb_empresa"),
                    (String) registro.get("direccion"),
                    (String) registro.get("telefono"));
            
            proveedores.add(prov);
        }
        return proveedores;
    }
    
    public int Eliminar(int ruc){
        String transaccion = "DELETE FROM Proveedor WHERE ruc='"+ ruc + "'";
        return new DataBase().Actualizar(transaccion);
    }
}
