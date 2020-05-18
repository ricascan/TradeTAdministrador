/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tradet.tradetclienteprueba;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author ricar
 */
public class Valoracion implements Serializable{
    private Usuario usuarioValorado;
    private Usuario usuarioValorador;
    private Integer puntuacion;
    private String comentario;

    public Valoracion() {
    }

    public Valoracion(Usuario usuarioValorado, Usuario usuarioValorador, Integer puntuacion, String comentario) {
        this.usuarioValorado = usuarioValorado;
        this.usuarioValorador = usuarioValorador;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
    }

    public Usuario getUsuarioValorado() {
        return usuarioValorado;
    }

    public void setUsuarioValorado(Usuario usuarioValorado) {
        this.usuarioValorado = usuarioValorado;
    }

    public Usuario getUsuarioValorador() {
        return usuarioValorador;
    }

    public void setUsuarioValorador(Usuario usuarioValorador) {
        this.usuarioValorador = usuarioValorador;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Valoracion{" + "usuarioValorado=" + usuarioValorado + ", usuarioValorador=" + usuarioValorador + ", puntuacion=" + puntuacion + ", comentario=" + comentario + '}';
    }
    
    public HashMap toHash() {
        HashMap map = new HashMap();
        map.put("usuario valorado", usuarioValorado.toHash());
        map.put("usuario valorador", usuarioValorador.toHash());
        map.put("puntuacion", puntuacion);
        map.put("comentario", comentario);
        return map;
    }
    
}
