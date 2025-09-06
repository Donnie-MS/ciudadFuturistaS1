package Misiones;

import Drones.Dron;

public abstract class Mision {
    public abstract Integer getExtra();

    public abstract boolean esAvanzadoEnEstaMision(Dron unDron);
}
