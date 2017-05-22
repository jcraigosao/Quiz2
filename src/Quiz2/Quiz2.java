/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Cristian Sarmiento
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Universidad nacional;
        
        ArrayList<String> datosTexto = new ArrayList<String>();
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        ArrayList<Facultad> facultades = new ArrayList<Facultad>();
        ArrayList<Staff> staff = new ArrayList<Staff>();
        String tipoDato = "";
        Datos datos = new Datos();
        datosTexto = datos.LeerArchivo();
        Codificar decodificador = new Codificar();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        for (String dato : datosTexto) {
            String[] datosSeparados = dato.split(",");
            tipoDato = datosSeparados[0];
            if (tipoDato.compareTo("STUDENT") == 0) {
                Estudiante estudiante = new Estudiante(decodificador.decodeText(datosSeparados[1]),
                        decodificador.decodeText(datosSeparados[2]),
                        decodificador.decodeText(datosSeparados[3]),
                        Double.parseDouble(datosSeparados[4]));
                estudiantes.add(estudiante);
            } else if (tipoDato.compareTo("FACULTY") == 0) {

                Facultad facultad = new Facultad(decodificador.decodeText(datosSeparados[1]),
                        Integer.parseInt(datosSeparados[2]),
                        format.parse(datosSeparados[3]),
                        decodificador.decodeText(datosSeparados[4]),
                        decodificador.decodeText(datosSeparados[5]),
                        Double.parseDouble(datosSeparados[6]));
                facultades.add(facultad);
            } else if (tipoDato.compareTo("STAFF") == 0) {
                Staff staffy = new Staff(decodificador.decodeText(datosSeparados[1]),
                        Integer.parseInt(datosSeparados[2]),
                        format.parse(datosSeparados[3]),
                        decodificador.decodeText(datosSeparados[4]),
                        decodificador.decodeText(datosSeparados[5]),
                        Double.parseDouble(datosSeparados[6]));
                staff.add(staffy);
            }

        }
        nacional = new Universidad(estudiantes, facultades, staff);
        
        System.out.println("El salario de los gerentes es: "+nacional.CalcularSalarioGerentes());
        System.out.println("El salario total de los empleados es: "+nacional.CalcularSalario());
        nacional.listarInfo();
    }

}
