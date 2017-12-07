/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_ingriddominguez;

import java.io.Serializable;

/**
 *
 * @author 1234
 */
public class cliente implements Serializable{
    private static final long SerialVersionUID = 777L;
    private String nombre;
    private int edad;
    private orden Orden;

    public cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public orden getOrden() {
        return Orden;
    }

    public void setOrden(orden Orden) {
        this.Orden = Orden;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
