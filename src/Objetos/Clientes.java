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
public class Clientes {
    private int Id_clientes;
    private String Nombres;
    private String Cedula;
    private String Direccion;
     private String Celular;
    private String Telefono;
    private int id_pais;
    private int id_provincia;
    private int id_ciudad;
    //private String Tipo_Cliente;

    public Clientes(int Id_clientes, String Nombres, String Cedula, String Direccion, String Celular, String Telefono, int id_pais, int id_provincia, int id_ciudad) {
        this.Id_clientes = Id_clientes;
        this.Nombres = Nombres;
        this.Cedula = Cedula;
        this.Direccion = Direccion;
        this.Celular = Celular;
        this.Telefono = Telefono;
        this.id_pais = id_pais;
        this.id_provincia = id_provincia;
        this.id_ciudad = id_ciudad;
    }

    /**
     * @return the Id_clientes
     */
    public int getId_clientes() {
        return Id_clientes;
    }

    /**
     * @param Id_clientes the Id_clientes to set
     */
    public void setId_clientes(int Id_clientes) {
        this.Id_clientes = Id_clientes;
    }

    /**
     * @return the Nombres
     */
    public String getNombres() {
        return Nombres;
    }

    /**
     * @param Nombres the Nombres to set
     */
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    /**
     * @return the Cedula
     */
    public String getCedula() {
        return Cedula;
    }

    /**
     * @param Cedula the Cedula to set
     */
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

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
     * @return the id_provincia
     */
    public int getId_provincia() {
        return id_provincia;
    }

    /**
     * @param id_provincia the id_provincia to set
     */
    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }

    /**
     * @return the id_ciudad
     */
    public int getId_ciudad() {
        return id_ciudad;
    }

    /**
     * @param id_ciudad the id_ciudad to set
     */
    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    
    
  
    
    
    
}
