/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import Objetos.Ciudades;
import Objetos.Provincias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import pruebahotel.ConexionBD;

/**
 *
 * @author Yandri
 */
public class CiudadesMetodos {
      public void Listar_Ciudad (JComboBox box, int id ){
        DefaultComboBoxModel value;
        ConexionBD connect =  new ConexionBD();
        PreparedStatement  ps  = null; //Abrir la consulta.
        Connection  con = null; //Para la conexion.
        ResultSet rs = null; //Ejecutar la consulta.
        
        try {
            con = connect.ConectarSQLServerJava();
            ps = con.prepareStatement("select * from Ciudades where id_provincia = ? ");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            value = new DefaultComboBoxModel();
            box.setModel(value);
            
            while (rs.next()){
                value.addElement(new Ciudades(rs.getInt(1), rs.getString(2)));//Creamos el objeto de tipo Box para llenar el Combobox
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            
        } finally{
          try 
          {
              connect.Desconectarse();
              ps.close();
              rs.close();
           } catch (Exception ex){
             System.out.println("Error:"+ ex.getMessage()); 
             }
        
        
        } 
    }
    
    
}
