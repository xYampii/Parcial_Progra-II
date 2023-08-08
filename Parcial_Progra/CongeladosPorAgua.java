
// Clase CongeladosPorAgua
class CongeladosPorAgua extends ProductosCongelados {
    private double salinidadAgua;

    public CongeladosPorAgua(Date fechaCaducidad, String numeroLote, String paisOrigen,
                             double temperaturaMantenimiento, double salinidadAgua) {
        super(fechaCaducidad, numeroLote, paisOrigen, temperaturaMantenimiento);
        this.salinidadAgua = salinidadAgua;
    }

    public double getSalinidadAgua() {
        return salinidadAgua;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo: Congelados por Agua");
        System.out.println("Salinidad del Agua: " + salinidadAgua);
        System.out.println("País de Origen: " + getPaisOrigen());
        System.out.println("Temperatura de Mantenimiento: " + getTemperaturaMantenimiento());
        System.out.println("Fecha de Caducidad: " + getFechaCaducidad());
        System.out.println("Número de Lote: " + getNumeroLote());
    }
}
