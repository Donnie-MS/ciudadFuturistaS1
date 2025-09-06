package Drones;

public class DronSeguridad extends Dron {
    public DronSeguridad(Integer autonomia, Integer procesamiento) {
        super(autonomia, procesamiento);
    }

    @Override
    public boolean esAvanzado() {
        return this.getProcesamiento() > 50;
    }
}
