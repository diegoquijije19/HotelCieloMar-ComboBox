/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import Objetos.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import pruebahotel.ConexionBD;

/**
 *
 * @author Yandri
 */
public class ClienteMetodos {
    public int  Guardar (Clientes cli){
        
         ConexionBD connect =  new ConexionBD();
        PreparedStatement  ps  = null; //Abrir la consulta.
        Connection  con = null; //Para la conexion.
        ResultSet rs = null; //Ejecutar la consulta.
        
        int r=0;
        try {
            con = connect.ConectarSQLServerJava();
            ps = con.prepareStatement("insert into Clientes (Id_cliente, Nombres, Cedula, Direccíon, celular, telefono, id_pais, id_provincia, id_ciudad) values (?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,cli.getId_clientes() );
            ps.setString(2, cli.getNombres());
            ps.setString(3, cli.getCedula());
            ps.setString(4, cli.getDireccion());
            ps.setString(5, cli.getCelular());
            ps.setString(6, cli.getTelefono());
            ps.setInt(7,  cli.getId_pais());
            ps.setInt(8, cli.getId_provincia());
            ps.setInt(9, cli.getId_ciudad());
            //ps.setString(10, cli.getTipo_Cliente());
            r = ps.executeUpdate();
            
          
        }catch (Exception ex){
            System.out.println("Error:"+ ex.getMessage());
        }       
        return r;
      
    }
    
}
