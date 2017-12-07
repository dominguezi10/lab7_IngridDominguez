/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_ingriddominguez;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 1234
 */
public class cajero implements Serializable, Runnable {
    private boolean seguir = true;
    private Ventana frame = new Ventana();
    private orden laOrden;
    private String nombre;
    private int id;
    private ArrayList<orden> ordenes = new ArrayList();
    private static final long SerialVersionIUD = 777L;

    public cajero(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Ventana getFrame() {
        return frame;
    }

    public void setFrame(Ventana frame) {
        this.frame = frame;
    }

    @Override
    public String toString() {
        return nombre;
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

    //mutador extra
    public void setOrdenX(orden Orden) {
        laOrden = Orden;
    }

    @Override
    public void run() {
        frame.jl_nombreCajero.setText(laOrden.getCajero().getNombre());
        frame.jl_nombreCliente.setText(laOrden.getCliente().getNombre());

        while (seguir == true) {

            
            for (int i = 0; i < laOrden.getProductos().size(); i++) {
                int tiempo = ((laOrden.getProductos().get(i).getTiempo()) * 1000);

                try {
                    frame.tf_productoEnProceso.setText(laOrden.getProductos().get(i).getNombre());
                    Thread.sleep(tiempo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(cajero.class.getName()).log(Level.SEVERE, null, ex);
                }

                frame.tf_productoEnProceso.setText("");
                DefaultTableModel model = (DefaultTableModel) frame.jt_tabla.getModel();
                Object[] newrow = {laOrden.getProductos().get(i).getNombre(),
                    laOrden.getCliente().getNombre(),
                    laOrden.getProductos().get(i).getTiempo()};

                model.addRow(newrow);
                frame.jt_tabla.setModel(model);

            }// fin del for

            try {
                ///frame.tf_productoEnProceso.setText(laOrden.getProductos().get(i).getNombre());
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            seguir = false;
        }// fin del while
    }

}
