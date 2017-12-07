/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_ingriddominguez;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 1234
 */
public class cajero implements Serializable {

    private String nombre;
    private int id;
    private ArrayList<orden> ordenes = new ArrayList();
    private static final long SerialVersionIUD = 777L;

    public cajero(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public String toString() {
        return "cajero{" + "nombre=" + nombre + '}';
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<orden> ordenes) {
        this.ordenes = ordenes;
    }
    
    

}
