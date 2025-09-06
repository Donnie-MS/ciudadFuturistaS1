package Drones;

public class Sensor {
    private final Integer capacidad;
    private final Integer durabilidad;
    private final boolean tieneMejorasTecnologicas;

    public Sensor(Integer capacidad, Integer durabilidad, boolean tieneMejorasTecnologicas) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.tieneMejorasTecnologicas = tieneMejorasTecnologicas;
    }

    public boolean esDuradero() {
        return durabilidad > (capacidad * 2);
    }

    public Integer getEficiencia() {
        Integer eficienciaFinal = capacidad;
        if (tieneMejorasTecnologicas) {
            eficienciaFinal *= 2;
        }
        return eficienciaFinal;
    }
}
