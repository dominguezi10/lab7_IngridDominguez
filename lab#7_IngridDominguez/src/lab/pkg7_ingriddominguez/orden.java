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
public class orden implements Serializable {
    private static final long SerialVersionUID = 777L;
    private cajero Cajero;
    private cliente Cliente;
    private ArrayList<producto> productos = new ArrayList();

    public orden(cajero Cajero, cliente Cliente) {
        this.Cajero = Cajero;
        this.Cliente = Cliente;
    }

    
    
    public cajero getCajero() {
        return Cajero;
    }

    public void setCajero(cajero Cajero) {
        this.Cajero = Cajero;
    }

    public cliente getCliente() {
        return Cliente;
    }

    public void setCliente(cliente Cliente) {
        this.Cliente = Cliente;
    }

    public ArrayList<producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "orden{" + "Cajero=" + Cajero + ", Cliente=" + Cliente + ", productos=" + productos + '}';
    }
    
    
    
    
}
