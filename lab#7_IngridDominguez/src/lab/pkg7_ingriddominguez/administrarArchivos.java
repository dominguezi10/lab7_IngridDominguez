/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_ingriddominguez;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 1234
 */
public class administrarArchivos implements Serializable {

    private File archivo = null;
    private ArrayList<producto> elementos = new ArrayList();
    private static final long SerialVersionUID = 777L;

    public administrarArchivos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<producto> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<producto> elementos) {
        this.elementos = elementos;
    }

    

    // metodo para guardar
    public void cargarArchivo() {
        try {
            elementos = new ArrayList();
            producto objeto;

            if (archivo.exists()) {
                FileInputStream fr = new FileInputStream(archivo);
                ObjectInputStream or = new ObjectInputStream(fr);

                try {

                    while ( (objeto = (producto) or.readObject() )    != null) {
                        elementos.add(objeto);
                    }// fin del while
                } catch (Exception e) {
                }

                or.close();
                fr.close();
                
            }// fin del if

        } catch (Exception e) {
            e.printStackTrace();
        }
    }// fin del metodo
    
    
    //metodo para escribir el archivo
    public void escribirArchivo() throws Exception{
        FileOutputStream fw = null;
        ObjectOutputStream ow = null;
        
        try {
            fw = new FileOutputStream(archivo);
            ow = new ObjectOutputStream(fw);
            
            for (producto t : elementos) {
                ow.writeObject(t);
            }
            
            ow.flush();
        } catch (Exception e) {
        }
        
        ow.close();
        fw.close();
        
    }// fin del metodo
    

}// fin de la clase
