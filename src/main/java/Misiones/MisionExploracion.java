package Misiones;

import Drones.Dron;

public class MisionExploracion extends Mision {
    public Integer getExtra() {
        return 0;
    }
    @Override
    public boolean esAvanzadoEnEstaMision(Dron unDron) {
        return (unDron.getEficienciaOperativa() % 2) == 0;
    }
}
