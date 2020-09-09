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
public class Provincias {

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
     * @return the id_provincias
     */
    public int getId_provincias() {
        return id_provincias;
    }

    /**
     * @param id_provincias the id_provincias to set
     */
    public void setId_provincias(int id_provincias) {
        this.id_provincias = id_provincias;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    private int id_provincias;
    private String provincia;
    private int id_pais;
    
    public Provincias (){}
    public Provincias (int id, String nombre){
        this.id_provincias = id;
        this.provincia = nombre;
    }
    
    public String toString (){ //Metodo para convertir el dato en String
        return this.provincia;
    }
    
}
