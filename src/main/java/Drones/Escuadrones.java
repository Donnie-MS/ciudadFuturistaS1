package Drones;

import java.util.ArrayList;
import java.util.List;

import CiudadFutirista.Ciudad;

public class Escuadrones {
    List<Dron> drones = new ArrayList<>();

    public void agregarAEscuadron(Dron unDron) {
        if (this.sePuedeAgregarUnDron()) {
            drones.add(unDron);    
        }
    }

    private boolean sePuedeAgregarUnDron() {
        return drones.size() < Ciudad.getMaxDronesPorEscuadron();
    }
}
