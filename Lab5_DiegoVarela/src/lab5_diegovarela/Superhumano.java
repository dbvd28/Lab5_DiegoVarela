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
public class Superhumano {
    protected String nombre;
    protected String poder;
    protected String debilidad;
    private Escuadron escuadron;
    private int fuerza;
    private int agilfis;
    private int agilment;

    public Superhumano(String nombre, String poder, String debilidad,  int fuerza, int agilfis, int agilment) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.fuerza = fuerza;
        this.agilfis = agilfis;
        this.agilment = agilment;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public Escuadron getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(Escuadron escuadron) {
        this.escuadron = escuadron;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilfis() {
        return agilfis;
    }

    public void setAgilfis(int agilfis) {
        this.agilfis = agilfis;
    }

    public int getAgilment() {
        return agilment;
    }

    public void setAgilment(int agilment) {
        this.agilment = agilment;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Poder=" + poder + '}';
    }
    
    
}
