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
public class DAOEmpleado {
    
    public Empleado Insertar(String cedula, String nombres,String apellidos, java.sql.Date fecha_nac,String direccion, char sexo,String celular){
        String transaccion = "INSERT INTO Empleado VALUES('"
                + nombres + "','"
                + apellidos + "','"
                + fecha_nac + "','"
                + cedula + "','"
                + direccion + "','"
                + sexo + "','"
                + celular + "')";
        
        if (new DataBase().Actualizar(transaccion) > 0){
            return new Empleado(cedula, nombres, apellidos, fecha_nac, direccion, sexo, celular);
        }
        
        return null;
    }
    
    public int Actualizar (int id, String cedula, String nombres, String apellidos, java.sql.Date fecha_nac, String direccion, char sexo, String celular){
        String transaccion ="UPDATE Empleado SET nombres='"
                + nombres + "', apellidos='"
                + apellidos + "', fecha_nac='"
                + fecha_nac + "'cedula='"
                + cedula + "', sexo='"
                + sexo + "', celular='"
                + celular + "'WHERE id_empl="
                + id;
        return new DataBase().Actualizar(transaccion);
    }
    
    public List obtenerDatos(){
        String transaccion = "SELECT * FROM Empleado";
        
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Empleado> empleados = new ArrayList();
        
        for (Map registro : registros){
            Empleado emp = new Empleado((int) registro.get("id_empl"),
            (String) registro.get("nombres"),
            (String) registro.get("apellidos"),
            (String) registro.get("cedula"),
            (java.sql.Date) registro.get("fecha_nac"),
            (String) registro.get("direccion"),
            (char) registro.get("sexo"),
            (String) registro.get("celular"));
            
            empleados.add(emp);
        }
        return empleados;
    }
    
    public int Eliminar(int id){
        String transaccion = "DELETE FROM Empleado WHERE id_empl='+ id +"
                + "'";
        return new DataBase().Actualizar(transaccion);
    }
}
