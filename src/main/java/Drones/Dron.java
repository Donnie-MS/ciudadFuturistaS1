package Drones;

import Misiones.Mision;

public abstract class Dron {
    private Integer autonomia = 0;
    private final Integer procesamiento;
    private Mision misionActual;

    public Dron(Integer autonomia, Integer procesamiento) {
        this.autonomia = autonomia;
        this.procesamiento = procesamiento;
    }

    public Integer getEficienciaOperativa() {
        
    }

    public void cambiarMision(Mision nuevaMision) {
        misionActual = nuevaMision;
    }

    public Integer getProcesamiento() {
        return procesamiento;
    }
    public Integer getAutonomia() {
        return autonomia;
    }

    public void setAutonmia(Integer autonomia) {
        this.autonomia = autonomia;
    }
}