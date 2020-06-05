/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_diegovarela;

/**
 *
 * @author diego
 */
public class Heroe extends Superhumano {

    public Heroe(String nombre, String poder, String debilidad, int fuerza, int agilfis, int agilment) {
        super(nombre, poder, debilidad, fuerza, agilfis, agilment);
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Poder=" + poder ;
    }
    
}
