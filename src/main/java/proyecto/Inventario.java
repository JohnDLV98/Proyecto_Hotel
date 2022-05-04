package proyecto;

public class Inventario {
    
        private String Pedido;
        private TipoServicio Factura;
        private InventarioBar Inventario;
    
        public Inventario(String Pedido, TipoServicio Factura, InventarioBar Inventario) {
            this.Pedido = Pedido;
            this.Factura = Factura;
            this.Inventario = Inventario;
        }
    
        public String getPedido() {
            return Pedido;
        }
    
        public void setPedido(String Pedido) {
            this.Pedido = Pedido;
        }
    
        public TipoServicio getFactura() {
            return Factura;
        }
    
        public void setFactura(TipoServicio Factura) {
            this.Factura = Factura;
        }
    
        public InventarioBar getInventario() {
            return Inventario;
        }
    
        public void setInventario(InventarioBar Inventario) {
            this.Inventario = Inventario;
        }
        
    
        private static class TipoServicio {
    
            
        }
    
        private static class InventarioBar {
    
            
        }
        
    }
    

