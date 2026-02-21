
package modelo;

import arreglo.Nodo;


public class Enlace {
    Nodo enlace;
    int litros_diarios;
    int capacidad_almacenimiento;
    int nivel_actual;

    public Enlace(Nodo enlace, int litros_diarios, int capacidad_almacenimiento, int nivel_actual) {
        this.enlace = enlace;
        this.litros_diarios = litros_diarios;
        this.capacidad_almacenimiento = capacidad_almacenimiento;
        this.nivel_actual = nivel_actual;
    }

    
    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    public int getLitros_diarios() {
        return litros_diarios;
    }

    public void setLitros_diarios(int litros_diarios) {
        this.litros_diarios = litros_diarios;
    }

    public int getCapacidad_almacenimiento() {
        return capacidad_almacenimiento;
    }

    public void setCapacidad_almacenimiento(int capacidad_almacenimiento) {
        this.capacidad_almacenimiento = capacidad_almacenimiento;
    }

    public int getNivel_actual() {
        return nivel_actual;
    }

    public void setNivel_actual(int nivel_actual) {
        this.nivel_actual = nivel_actual;
    }


    

    
    
    
    
    
    
    
    
    
}
