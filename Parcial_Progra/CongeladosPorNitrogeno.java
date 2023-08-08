// Clase CongeladosPorNitrógeno
class CongeladosPorNitrogeno extends ProductosCongelados {
    private String metodoCongelacion;
    private int tiempoExposicion;

    public CongeladosPorNitrogeno(Date fechaCaducidad, String numeroLote, String paisOrigen,
                                  double temperaturaMantenimiento, String metodoCongelacion,
                                  int tiempoExposicion) {
        super(fechaCaducidad, numeroLote, paisOrigen, temperaturaMantenimiento);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public int getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo: Congelados por Nitrógeno");
        System.out.println("Método de Congelación: " + metodoCongelacion);
        System.out.println("Tiempo de Exposición al Nitrógeno: " + tiempoExposicion + " segundos");
        System.out.println("País de Origen: " + getPaisOrigen());
        System.out.println("Temperatura de Mantenimiento: " + getTemperaturaMantenimiento());
        System.out.println("Fecha de Caducidad: " + getFechaCaducidad());
        System.out.println("Número de Lote: " + getNumeroLote());
    }
}