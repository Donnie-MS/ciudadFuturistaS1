package CiudadFutirista;
public class Ciudad {
    private static Integer maxDronesPorEscuadron = 10;

    static public Integer getMaxDronesPorEscuadron() {
        return maxDronesPorEscuadron;
    }

    public void setMaxDronesPorEscuadron(Integer nuevoMax) {
        maxDronesPorEscuadron = nuevoMax;
    }
}
