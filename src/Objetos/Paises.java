/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Yandri
 */
public class Paises {

    /**
     * @return the id_pais
     */
    public int getId_pais() {
        return id_pais;
    }

    /**
     * @param id_pais the id_pais to set
     */
    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    /**
     * @return the Pais
     */
    public String getPais() {
        return Pais;
    }

    /**
     * @param Pais the Pais to set
     */
    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    private int  id_pais;
    private String Pais;
    
    public Paises(){}
    
     public Paises(int id, String nombre){
     this.id_pais = id;
     this.Pais = nombre;
     }
     
     public String toString (){  //Metodo para convertir al dato en String
        return this.Pais;
     }
    
    
    
    
    
    
}
