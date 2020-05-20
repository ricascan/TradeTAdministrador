/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tradet.programaadministrador;

import com.tradet.excepciones.ExcepcionTradeT;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricar
 */
public class ComunicacionServidor {

    private final String IP = "localhost";
    private final Integer PUERTO = 5557;

    public String insertarCategoria(Categoria c) throws ExcepcionTradeT {
        HashMap peticion = new HashMap();

        peticion.put("peticion", "insertar categoria");
        peticion.put("argumento", c.toHash());

        try {
            Socket socket = new Socket(IP, PUERTO);
            ObjectOutputStream flujoSalida = new ObjectOutputStream(socket.getOutputStream());
            flujoSalida.writeObject(peticion);
            flujoSalida.flush();
            ObjectInputStream flujoEntrada = new ObjectInputStream(socket.getInputStream());
            Object resultado = flujoEntrada.readObject();
            ExcepcionTradeT excepcionTradeT = new ExcepcionTradeT();
            String respuesta;
            if (resultado instanceof String) {
                respuesta = (String) resultado;
                return respuesta;
            } else if (resultado instanceof ExcepcionTradeT) {
                excepcionTradeT = (ExcepcionTradeT) resultado;
                throw excepcionTradeT;
            }
            flujoEntrada.close();
            flujoSalida.close();
            socket.close();

        } catch (IOException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String eliminarCategoria(Categoria c) throws ExcepcionTradeT {
        HashMap peticion = new HashMap();

        peticion.put("peticion", "eliminar categoria");
        peticion.put("argumento", c.getCategoriaId());

        try {
            Socket socket = new Socket(IP, PUERTO);
            ObjectOutputStream flujoSalida = new ObjectOutputStream(socket.getOutputStream());
            flujoSalida.writeObject(peticion);
            flujoSalida.flush();
            ObjectInputStream flujoEntrada = new ObjectInputStream(socket.getInputStream());
            Object resultado = flujoEntrada.readObject();
            ExcepcionTradeT excepcionTradeT = new ExcepcionTradeT();
            String respuesta;
            if (resultado instanceof String) {
                respuesta = (String) resultado;
                return respuesta;
            } else if (resultado instanceof ExcepcionTradeT) {
                excepcionTradeT = (ExcepcionTradeT) resultado;
                throw excepcionTradeT;
            }
            flujoEntrada.close();
            flujoSalida.close();
            socket.close();

        } catch (IOException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Categoria> leerCategorias() throws ExcepcionTradeT {
        HashMap peticion = new HashMap();
        peticion.put("peticion", "leer categorias");

        Socket socket;
        try {
            socket = new Socket(IP, PUERTO);
            ObjectOutputStream flujoSalida = new ObjectOutputStream(socket.getOutputStream());
            flujoSalida.writeObject(peticion);
            flujoSalida.flush();
            ObjectInputStream flujoEntrada = new ObjectInputStream(socket.getInputStream());
            Object resultado = flujoEntrada.readObject();
            if (resultado instanceof ArrayList) {
                ArrayList<HashMap> listaHash = (ArrayList<HashMap>) resultado;
                ArrayList<Categoria> listaCategorias = new ArrayList<>();

                for (HashMap map : listaHash) {
                    Categoria c = new Categoria(map);
                    listaCategorias.add(c);
                }

                return listaCategorias;
            } else if (resultado instanceof ExcepcionTradeT) {
                ExcepcionTradeT excepcionTradeT = (ExcepcionTradeT) resultado;
                throw excepcionTradeT;
            }
            flujoEntrada.close();
            flujoSalida.close();
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String insertarSorteo(Sorteo s) throws ExcepcionTradeT {
        HashMap peticion = new HashMap();

        peticion.put("peticion", "insertar sorteo");
        peticion.put("argumento", s.toHash());

        try {
            Socket socket = new Socket(IP, PUERTO);
            ObjectOutputStream flujoSalida = new ObjectOutputStream(socket.getOutputStream());
            flujoSalida.writeObject(peticion);
            flujoSalida.flush();
            ObjectInputStream flujoEntrada = new ObjectInputStream(socket.getInputStream());
            Object resultado = flujoEntrada.readObject();
            ExcepcionTradeT excepcionTradeT = new ExcepcionTradeT();
            String respuesta;
            if (resultado instanceof String) {
                respuesta = (String) resultado;
                return respuesta;
            } else if (resultado instanceof ExcepcionTradeT) {
                excepcionTradeT = (ExcepcionTradeT) resultado;
                throw excepcionTradeT;
            }
            flujoEntrada.close();
            flujoSalida.close();
            socket.close();

        } catch (IOException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String modificarSorteo(Sorteo s) throws ExcepcionTradeT {
        HashMap peticion = new HashMap();

        peticion.put("peticion", "modificar sorteo");
        peticion.put("argumento", s.toHash());

        try {
            Socket socket = new Socket(IP, PUERTO);
            ObjectOutputStream flujoSalida = new ObjectOutputStream(socket.getOutputStream());
            flujoSalida.writeObject(peticion);
            flujoSalida.flush();
            ObjectInputStream flujoEntrada = new ObjectInputStream(socket.getInputStream());
            Object resultado = flujoEntrada.readObject();
            ExcepcionTradeT excepcionTradeT = new ExcepcionTradeT();
            String respuesta;
            if (resultado instanceof String) {
                respuesta = (String) resultado;
                return respuesta;
            } else if (resultado instanceof ExcepcionTradeT) {
                excepcionTradeT = (ExcepcionTradeT) resultado;
                throw excepcionTradeT;
            }
            flujoEntrada.close();
            flujoSalida.close();
            socket.close();

        } catch (IOException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String eliminarSorteo(Sorteo s) throws ExcepcionTradeT {
        HashMap peticion = new HashMap();

        peticion.put("peticion", "eliminar sorteo");
        peticion.put("argumento", s.getSorteoId());

        try {
            Socket socket = new Socket(IP, PUERTO);
            ObjectOutputStream flujoSalida = new ObjectOutputStream(socket.getOutputStream());
            flujoSalida.writeObject(peticion);
            flujoSalida.flush();
            ObjectInputStream flujoEntrada = new ObjectInputStream(socket.getInputStream());
            Object resultado = flujoEntrada.readObject();
            ExcepcionTradeT excepcionTradeT = new ExcepcionTradeT();
            String respuesta;
            if (resultado instanceof String) {
                respuesta = (String) resultado;
                return respuesta;
            } else if (resultado instanceof ExcepcionTradeT) {
                excepcionTradeT = (ExcepcionTradeT) resultado;
                throw excepcionTradeT;
            }
            flujoEntrada.close();
            flujoSalida.close();
            socket.close();

        } catch (IOException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Sorteo> leerSorteos() throws ExcepcionTradeT {
        HashMap peticion = new HashMap();
        peticion.put("peticion", "leer sorteos");

        Socket socket;
        try {
            socket = new Socket(IP, PUERTO);
            ObjectOutputStream flujoSalida = new ObjectOutputStream(socket.getOutputStream());
            flujoSalida.writeObject(peticion);
            flujoSalida.flush();
            ObjectInputStream flujoEntrada = new ObjectInputStream(socket.getInputStream());
            Object resultado = flujoEntrada.readObject();
            if (resultado instanceof ArrayList) {
                ArrayList<HashMap> listaHash = (ArrayList<HashMap>) resultado;
                ArrayList<Sorteo> listaSorteos = new ArrayList<>();

                for (HashMap map : listaHash) {
                    Sorteo s = new Sorteo(map);
                    listaSorteos.add(s);
                }

                return listaSorteos;
            } else if (resultado instanceof ExcepcionTradeT) {
                ExcepcionTradeT excepcionTradeT = (ExcepcionTradeT) resultado;
                throw excepcionTradeT;
            }
            flujoEntrada.close();
            flujoSalida.close();
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean hacerCopia() {
        
            HashMap peticion = new HashMap();
            peticion.put("peticion", "hacer copia");
        try {    
            Socket socket;
            socket = new Socket(IP, PUERTO);
            ObjectOutputStream flujoSalida = new ObjectOutputStream(socket.getOutputStream());
            flujoSalida.writeObject(peticion);
            flujoSalida.flush();
            ObjectInputStream flujoEntrada = new ObjectInputStream(socket.getInputStream());
            Object resultado = flujoEntrada.readObject();
            if(((String)resultado).equals("ok")){
                return true;
            } else{
                return false;
            }
        } catch (IOException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean restaurarCopia() {
        
            HashMap peticion = new HashMap();
            peticion.put("peticion", "restaurar copia");
        try {    
            Socket socket;
            socket = new Socket(IP, PUERTO);
            ObjectOutputStream flujoSalida = new ObjectOutputStream(socket.getOutputStream());
            flujoSalida.writeObject(peticion);
            flujoSalida.flush();
            ObjectInputStream flujoEntrada = new ObjectInputStream(socket.getInputStream());
            Object resultado = flujoEntrada.readObject();
            if(((String)resultado).equals("ok")){
                return true;
            } else{
                return false;
            }
        } catch (IOException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComunicacionServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
