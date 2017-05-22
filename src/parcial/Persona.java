/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Cristian Sarmiento
 */
public abstract class Persona implements Salario{
protected String nombre;
protected String apellido;
protected double Salario;

    public Persona(String nombre, String apellido, double Salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Salario = Salario;
    }

}
