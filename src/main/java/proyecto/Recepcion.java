package proyecto;

public class Recepcion {
    private String Registros;
    private int Llamadas;
    private String Facturacion;    

    public Recepcion(String Registros, int Llamadas, String Facturacion) {
        this.Registros = Registros;
        this.Llamadas = Llamadas;
        this.Facturacion = Facturacion;
    }

    public String getRegistros() {
        return Registros;
    }

    public void setRegistros(String Registros) {
        this.Registros = Registros;
    }

    public int getLlamadas() {
        return Llamadas;
    }

    public void setLlamadas(int Llamadas) {
        this.Llamadas = Llamadas;
    }

    public String getFacturacion() {
        return Facturacion;
    }

    public void setFacturacion(String Facturacion) {
        this.Facturacion = Facturacion;
    }

        
    
    }

