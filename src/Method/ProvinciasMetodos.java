/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import Objetos.Paises;
import Objetos.Provincias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import pruebahotel.ConexionBD;

/**
 *
 * @author Yandri
 */
public class ProvinciasMetodos {
     public void Listar_Provincia (JComboBox box, int id ){
        DefaultComboBoxModel value;
        ConexionBD connect =  new ConexionBD();
        PreparedStatement  ps  = null; //Abrir la consulta.
        Connection  con = null; //Para la conexion.
        ResultSet rs = null; //Ejecutar la consulta.
        
        try {
            con = connect.ConectarSQLServerJava();
            ps = con.prepareStatement("select * from Provincias where id_pais = ? ");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            value = new DefaultComboBoxModel();
            box.setModel(value);
            
            while (rs.next()){
                value.addElement(new Provincias(rs.getInt(1), rs.getString(2)));//Creamos el objeto de tipo Box para llenar el Combobox
            }
        }catch (Exception ex){
            
        } finally{
          try {
              connect.Desconectarse();
              ps.close();
              rs.close();
          } catch (Exception ex){
              
          }
        
        
        
    }
    }
}
