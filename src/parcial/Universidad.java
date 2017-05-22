/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.ArrayList;

/**
 *
 * @author Cristian Sarmiento
 */
public class Universidad implements Salario {

    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Facultad> facultades;
    private ArrayList<Staff> staff;

    public Universidad(ArrayList<Estudiante> alumnos, ArrayList<Facultad> decanaturas, ArrayList<Staff> personal) {
        estudiantes = alumnos;
        facultades = decanaturas;
        staff = personal;
    }

    /**
     * @return the estudiantes
     */
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    /**
     * @param estudiantes the estudiantes to set
     */
    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    /**
     * @return the facultades
     */
    public ArrayList<Facultad> getFacultades() {
        return facultades;
    }

    /**
     * @param facultades the facultades to set
     */
    public void setFacultades(ArrayList<Facultad> facultades) {
        this.facultades = facultades;
    }

    /**
     * @return the staff
     */
    public ArrayList<Staff> getStaff() {
        return staff;
    }

    /**
     * @param staff the staff to set
     */
    public void setStaff(ArrayList<Staff> staff) {
        this.staff = staff;
    }

    public double CalcularSalarioGerentes() {
        double salarioTotalGerentes = 0;
        for (Staff staf : staff) {
            if (staf.titulo.compareTo("GERENTE") == 0) {
                salarioTotalGerentes += staf.Salario;
            }

        }
        return salarioTotalGerentes;
    }

    @Override
    public double CalcularSalario() {
        double salarioTotal = 0;
        for (Estudiante e : estudiantes) {

            salarioTotal += e.Salario;

        }
        for (Facultad f : facultades) {
            salarioTotal += f.Salario;
        }
        for (Staff s : staff) {
            salarioTotal += s.Salario;
        }
        return salarioTotal;
    }
    
    public void listarInfo(){
    for(Estudiante e:estudiantes){
        System.out.println(e.nombre + " " + e.apellido + " " + e.Salario);
    }
    for(Facultad f: facultades){
        System.out.println(f.nombre + " " + f.apellido + " " + f.Salario + " " + f.rango + " " + f.oficina + " " + f.fecha);
    }
    for(Staff s: staff){
        System.out.println(s.nombre + " " + s.apellido + " " + s.Salario + " " + s.titulo + " " + s.oficina + " " + s.fecha);
    }
    }

}
