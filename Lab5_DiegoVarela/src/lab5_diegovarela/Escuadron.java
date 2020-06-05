/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_diegovarela;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Escuadron {
    private String nombre;
    private String base;
    private Superhumano lider;
    private String tipo;
    private ArrayList<Superhumano> escuadron=new ArrayList();

    public Escuadron(String nombre, String base, Superhumano lider, String tipo) {
        this.nombre = nombre;
        this.base = base;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Superhumano getLider() {
        return lider;
    }

    public void setLider(Superhumano lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Superhumano> getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(ArrayList<Superhumano> escuadron) {
        this.escuadron = escuadron;
    }

    @Override
    public String toString() {
        return "Escuadron{" + nombre + ", base=" + base + '}';
    }
    
}
