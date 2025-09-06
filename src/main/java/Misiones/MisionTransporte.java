package Misiones;

import Drones.Dron;

public class MisionTransporte extends Mision{
    public Integer getExtra() {
        return 100;
    }
    @Override
    public boolean esAvanzadoEnEstaMision(Dron unDron) {
        return unDron.getAutonomia() > 50;
    }
}
