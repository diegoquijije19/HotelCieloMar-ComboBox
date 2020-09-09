/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import Objetos.Paises;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import pruebahotel.ConexionBD;

/**
 *
 * @author Yandri
 */
public class PaisesMetodos {
    
    public void Listar_Pais (JComboBox box ){
        DefaultComboBoxModel value;
        ConexionBD connect =  new ConexionBD();
        Statement  st  = null; //Abrir la consulta.
        Connection  con = null; //Para la conexion.
        ResultSet rs = null; //Ejecutar la consulta.
        
        try {
            con = connect.ConectarSQLServerJava();
            st = con.createStatement();
            rs = st.executeQuery("select * from Paises");
            value = new DefaultComboBoxModel();
            box.setModel(value);
            
            while (rs.next()){
                value.addElement(new Paises(rs.getInt(1), rs.getString(2)));//Creamos el objeto de tipo Box para llenar el Combobox
            }
        }catch (Exception ex){
            
        } finally{
          try {
              connect.Desconectarse();
              st.close();
              rs.close();
          } catch (Exception ex){
              
          }
        
        
        
    }
    }
}
