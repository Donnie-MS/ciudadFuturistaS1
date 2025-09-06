package Drones;

public class DronComercial extends Dron{

    public DronComercial(Integer autonomia, Integer procesamiento) {
        super(autonomia, procesamiento);
    }

    @Override
    public Integer getEficienciaOperativa() {
        return super.getEficienciaOperativa() + 15;
    }
    @Override
    public boolean esAvanzado() {
        return false;
    }
}
