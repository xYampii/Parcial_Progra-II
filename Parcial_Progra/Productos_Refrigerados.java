package Producto;

// Clase ProductosRefrigerados
class ProductosRefrigerados extends Producto {
    private String codigoSupervision;
    private Date fechaEnvasado;
    private double temperaturaRecomendada;
    private String paisOrigen;

    public ProductosRefrigerados(Date fechaCaducidad, String numeroLote, String codigoSupervision,Date fechaEnvasado, double temperaturaRecomendada, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.codigoSupervision = codigoSupervision;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.paisOrigen = paisOrigen;
    }

    public String getCodigoSupervision() {
        return codigoSupervision;
    }

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo: Productos Refrigerados");
        System.out.println("Código de Supervisión: " + codigoSupervision);
        System.out.println("Fecha de Envasado: " + fechaEnvasado);
        System.out.println("Temperatura Recomendada: " + temperaturaRecomendada);
        System.out.println("País de Origen: " + paisOrigen);
        System.out.println("Fecha de Caducidad: " + getFechaCaducidad());
        System.out.println("Número de Lote: " + getNumeroLote());
    }
}