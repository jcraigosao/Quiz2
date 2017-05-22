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
public class Staff extends Empleado{
protected String titulo;

    public Staff(String titulo, int oficina, Date fecha, String nombre, String apellido, double Salario) {
        super(oficina, fecha, nombre, apellido, Salario);
        this.titulo = titulo;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
}
