/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tradet.programaadministrador;

import java.util.HashMap;

/**
 *
 * @author ricar
 */
public class Sorteo {
    private Integer sorteoId;
    private String nombre;
    private String descripcion;

    public Sorteo() {
    }

    public Sorteo(Integer sorteoId) {
        this.sorteoId = sorteoId;
    }



    public Sorteo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }




    public Integer getSorteoId() {
        return this.sorteoId;
    }

    public void setSorteoId(Integer sorteoId) {
        this.sorteoId = sorteoId;
    }



    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Sorteo(HashMap map){
        if(map.containsKey("id"))
            sorteoId = (Integer) map.get("id");
        else
            sorteoId = null;
        nombre = (String) map.get("nombre");
        descripcion = (String) map.get("descripcion");
    }

    public HashMap toHash(){
        HashMap map = new HashMap();
        map.put("id", sorteoId);
        map.put("nombre", nombre);
        map.put("descripcion", descripcion);
        return map;
    }
}
