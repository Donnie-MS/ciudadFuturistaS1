package Drones;

public abstract class Dron {
    private Integer autonomia = 0;
    private final Integer procesamiento;

    //constructor:
    public Dron(Integer autonomia, Integer procesamiento) {
        this.autonomia = autonomia;
        this.procesamiento = procesamiento;
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