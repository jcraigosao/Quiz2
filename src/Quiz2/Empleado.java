
package Quiz2;

import java.util.Date;


public class Empleado extends Persona{
protected int oficina;
protected Date fecha;

    public Empleado(int oficina, Date fecha, String nombre, String apellido, double Salario) {
        super(nombre, apellido, Salario);
        this.oficina = oficina;
        this.fecha = fecha;
    }

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    

    @Override
    public double CalcularSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
