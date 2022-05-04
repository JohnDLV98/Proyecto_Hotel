package proyecto;

public class InformacionPago {
    private Double Efectivo;
    private Double Transaccion;
    private Double PagoConTarjeta;

    public InformacionPago(Double Efectivo, Double Transaccion, Double PagoConTarjeta) {
        this.Efectivo = Efectivo;
        this.Transaccion = Transaccion;
        this.PagoConTarjeta = PagoConTarjeta;
    }

    public Double getEfectivo() {
        return Efectivo;
    }

    public void setEfectivo(Double Efectivo) {
        this.Efectivo = Efectivo;
    }

    public Double getTransaccion() {
        return Transaccion;
    }

    public void setTransaccion(Double Transaccion) {
        this.Transaccion = Transaccion;
    }

    public Double getPagoConTarjeta() {
        return PagoConTarjeta;
    }

    public void setPagoConTarjeta(Double PagoConTarjeta) {
        this.PagoConTarjeta = PagoConTarjeta;
    }
    
    
    
}
