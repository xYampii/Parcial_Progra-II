package Producto;

// Clase ProductosFrescos
class ProductosFrescos extends Producto {
    private Date fechaEnvasado;
    private String paisOrigen;

    public ProductosFrescos(Date fechaCaducidad, String numeroLote, Date fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo: Productos Frescos");
        System.out.println("Fecha de Envasado: " + fechaEnvasado);
        System.out.println("País de Origen: " + paisOrigen);
        System.out.println("Fecha de Caducidad: " + getFechaCaducidad());
        System.out.println("Número de Lote: " + getNumeroLote());
    }
}
