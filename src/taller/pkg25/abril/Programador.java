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
public class Programador extends Empleado{
    
    private String lenguaje;

    public Programador(int id, String nombre, double salarioMensual, String lenguaje) {
        super(id, nombre, salarioMensual);
        this.lenguaje = lenguaje;
    }

    @Override
    public double calcularSalario() {
        double salarioTotal = this.salarioMensual;
        if (this.lenguaje.equals("java")) {
           salarioTotal += (this.salarioMensual*0.2); 
        }
        return salarioTotal;
    }

    @Override
    public String listarInformacion() {
        return "Programador" + this.id + " llamado " + this.nombre;
    }
    
}
