    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2;

/**
 *
 * @author Cristian Sarmiento
 */
public class Estudiante extends Persona{
private String status;

    public Estudiante( String nombre, String apellido,String status, double Salario) {
        super(nombre, apellido, Salario);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    @Override
    public double CalcularSalario() {
        return 100;
    }

}
