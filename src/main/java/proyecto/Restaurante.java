package proyecto;

public class Restaurante {
    private String Area;
    private String Pedidos;
    private String Inventario;
    private String ControlInventario;

    public Restaurante(String Area, String Pedidos, String Inventario, String ControlInventario) {
        this.Area = Area;
        this.Pedidos = Pedidos;
        this.Inventario = Inventario;
        this.ControlInventario = ControlInventario;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getPedidos() {
        return Pedidos;
    }

    public void setPedidos(String Pedidos) {
        this.Pedidos = Pedidos;
    }

    public String getInventario() {
        return Inventario;
    }

    public void setInventario(String Inventario) {
        this.Inventario = Inventario;
    }

    public String getControlInventario() {
        return ControlInventario;
    }

    public void setControlInventario(String ControlInventario) {
        this.ControlInventario = ControlInventario;
    }
    
    
}

