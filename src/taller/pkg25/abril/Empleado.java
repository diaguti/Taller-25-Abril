/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkg25.abril;

/**
 *
 * @author Estudiante
 */
public abstract class Empleado extends Trabajador{
    protected String nombre;
    protected double salarioMensual;

    public Empleado(int id, String nombre, double salarioMensual) {
        super(id);
        this.nombre = nombre;
        this.salarioMensual = salarioMensual;
    }

   
    
}
