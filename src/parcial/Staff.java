/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

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
    
    
//    @Override
//    public double CalcularSalario(){
//    
//   }

    
}
