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
public class Administrador extends Empleado{

    public Administrador(int id, String nombre, double salarioMensual) {
        super(id, nombre, salarioMensual);
    }

    @Override
    public double calcularSalario() {
        return this.salarioMensual;
    }

    @Override
    public String listarInformacion() {
        return "Administrador " + this.id + " llamado " + this.nombre;
    }
    
}
