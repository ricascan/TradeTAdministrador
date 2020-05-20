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
public class Categoria {
    private Integer categoriaId;
    private String nombre;

    public Categoria() {
    }

    public Categoria(Integer categoriaId){
        this.categoriaId = categoriaId;
    }
    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public Categoria(Integer categoriaId, String nombre) {
        this.categoriaId = categoriaId;
        this.nombre = nombre;
    }







    public Integer getCategoriaId() {
        return this.categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }



    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap toHash(){
        HashMap map = new HashMap();
        map.put("id", categoriaId);
        map.put("nombre", nombre);
        return map;
    }

    public Categoria(HashMap map){
        if(map.containsKey("id")){
            categoriaId = (Integer) map.get("id");
        }else{
            categoriaId = null;
        }
        nombre = (String) map.get("nombre");
    }


    @Override
    public String toString() {
        return this.nombre;
    }
}
