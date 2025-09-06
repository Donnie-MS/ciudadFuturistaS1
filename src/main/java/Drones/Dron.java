package Drones;

import java.util.ArrayList;
import java.util.List;

import Misiones.Mision;

public abstract class Dron {
    private Integer autonomia;
    private final Integer procesamiento;
    private Mision misionActual;
    private List<Sensor> sensores = new ArrayList<>();

    public Dron(Integer autonomia, Integer procesamiento) {
        this.autonomia = autonomia;
        this.procesamiento = procesamiento;
    }

    public void agregarSensor(Sensor unSensor) {
        sensores.add(unSensor);
    }

    public boolean tieneTodosLosSensoresDuraderos() {
        return sensores.stream().allMatch(sensor -> sensor.esDuradero());
    }

    public abstract boolean esAvanzado();

    public boolean esAvanzadoEnSuMision() {
        return misionActual.esAvanzadoEnEstaMision(this);
    }

    public Integer getEficienciaOperativa() {
        return (autonomia * 10) + misionActual.getExtra();
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