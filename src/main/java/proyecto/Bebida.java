package proyecto;


public class Bebida {
    private String Agua;
    private String Gaseosa;
    private String Aromatica;
    private String Cafe;
    private String Jugo;

    public Bebida(String Agua, String Gaseosa, String Aromatica, String Cafe, String Jugo) {
        this.Agua = Agua;
        this.Gaseosa = Gaseosa;
        this.Aromatica = Aromatica;
        this.Cafe = Cafe;
        this.Jugo = Jugo;
    }

    public String getAgua() {
        return Agua;
    }

    public void setAgua(String Agua) {
        this.Agua = Agua;
    }

    public String getGaseosa() {
        return Gaseosa;
    }

    public void setGaseosa(String Gaseosa) {
        this.Gaseosa = Gaseosa;
    }

    public String getAromatica() {
        return Aromatica;
    }

    public void setAromatica(String Aromatica) {
        this.Aromatica = Aromatica;
    }

    public String getCafe() {
        return Cafe;
    }

    public void setCafe(String Cafe) {
        this.Cafe = Cafe;
    }

    public String getJugo() {
        return Jugo;
    }

    public void setJugo(String Jugo) {
        this.Jugo = Jugo;
    }
    
    public boolean VerificarAgua(String Agua){
    
        return false;
    
    }
    
}