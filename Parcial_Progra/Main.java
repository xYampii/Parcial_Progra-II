public class Main {
    public static void main(String[] args) {
        
        ProductosFrescos productoFresco = new ProductosFrescos(new Date(), "Lote123",
            new Date(), "España");
        productoFresco.mostrarInformacion();

        ProductosRefrigerados productoRefrigerado = new ProductosRefrigerados(new Date(), "Lote456",
            "123ABC", new Date(), 4.0, "Francia");
        productoRefrigerado.mostrarInformacion();

        CongeladosPorAire productoCongeladoAire = new CongeladosPorAire(new Date(), "Lote789",
            "Italia", -15.0, 80.0, 20.0, 0.5, 2.0);
        productoCongeladoAire.mostrarInformacion();

        CongeladosPorAgua productoCongeladoAgua = new CongeladosPorAgua(new Date(), "Lote987",
            "México", -18.0, 10.5);
        productoCongeladoAgua.mostrarInformacion();

        CongeladosPorNitrogeno productoCongeladoNitrogeno = new CongeladosPorNitrogeno(new Date(),
            "Lote654", "Alemania", -20.0, "Método X", 120);
        productoCongeladoNitrogeno.mostrarInformacion();
    }
}
