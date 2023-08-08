package Producto;

// Clase Producto
class Producto {
    private Date fechaCaducidad;
    private String numeroLote;

    public Producto(Date fechaCaducidad, String numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }
}











