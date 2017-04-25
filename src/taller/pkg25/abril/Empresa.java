/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkg25.abril;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Empresa {
    ArrayList <Trabajador> trabajadores;
    
    public Empresa(){
        trabajadores = new ArrayList<>();
    }
    
    public void agregarTrabajador(Trabajador t){
        trabajadores.add(t);
    }
    
    public double calcularSalarioTotal(){
        double salarioTotal = 0;
        for (Trabajador trabajador : trabajadores) {
            salarioTotal += trabajador.calcularSalario();
        }
        return salarioTotal;
    }
    
    public String listarInfoTrabajadores(){
        String infoTotal = null;
        for (Trabajador trabajador : trabajadores) {
            infoTotal += trabajador.listarInformacion();
        }
        return infoTotal;
    }    
}
