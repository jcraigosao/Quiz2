/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian Sarmiento
 */
public class Datos {

    private File datos;
    Scanner sn = new Scanner(System.in);

    public Datos() {
        this.datos = new File("datos.txt");
    }

    public ArrayList<String> LeerArchivo() {
         ArrayList<String> datosTexto = new ArrayList<String>();
        try {
            sn = new Scanner(this.datos);
            int lineNumber = 1;
           
            while (sn.hasNextLine()) {
                String line = sn.nextLine();
                //System.out.println("line " + lineNumber + " :" + line);
                lineNumber++;
                datosTexto.add(line);
            }
            sn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return datosTexto;
    }
    
    
}
