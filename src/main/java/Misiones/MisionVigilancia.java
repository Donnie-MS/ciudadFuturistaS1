package Misiones;

import java.util.ArrayList;
import java.util.List;

import Drones.Sensor;

public class MisionVigilancia extends Mision{
    List<Sensor> sensores = new ArrayList<>();
    public Integer getExtra() {
        return this.eficienciaDeSensores();
    }

    private Integer eficienciaDeSensores() {
        return sensores.stream()
            .mapToInt(sensor -> sensor.getEficiencia())
            .sum();
    }
}
