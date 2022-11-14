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
public class DAOCompra {
    
    public Compra Insertar(String descripcion, java.sql.Date fecha_comp, String nomb_empresa){
        String transaccion = "INSERT INTO Compra VALUES('"
                + descripcion + "','"
                + fecha_comp + "','"
                + nomb_empresa + "')";
        
        if (new DataBase().Actualizar(transaccion) > 0){
            return new Compra(descripcion, fecha_comp, nomb_empresa);
        }
        return null;
    }
    
    public int Actualizar(int cod_comp, String descripcion, java.sql.Date fecha_comp, String nomb_empresa){
        String transaccion = "UPDATE Compra SET descripcion='"
                + descripcion + "', fecha_comp='"
                + fecha_comp + "', nomb_empresa='"
                + nomb_empresa + "' WHERE cod_comp="
                + cod_comp;
        
        return new DataBase().Actualizar(transaccion);
    }
    
    public List obtenerDatos(){
        String transaccion = "SELECT * FROM Compra";
        
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Compra> compras = new ArrayList();
        
        for(Map registro : registros){
            Compra comp = new Compra((int) registro.get("cod_comp"),
                    (String) registro.get("descripcion"),
                    (java.sql.Date) registro.get("fecha_comp"),
                    (String) registro.get("nomb_empresa"));
            
            compras.add(comp);
        }
        return compras;
    }
    
    public int Eliminar(int cod_comp){
        String transaccion = "DELETE FROM Compra WHERE cod_comp='"+ cod_comp + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
