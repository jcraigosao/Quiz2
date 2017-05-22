/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2;

import java.util.Date;

/**
 *
 * @author Cristian Sarmiento
 */
public class Facultad extends Empleado{
protected String rango;

    public Facultad(String rango, int oficina, Date fecha, String nombre, String apellido, double Salario) {
        super(oficina, fecha, nombre, apellido, Salario);
        this.rango = rango;
    }

}
