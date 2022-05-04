package proyecto;

public class TipoLicor{
    private String Aguardiente;
    private String Cerveza;
    private String Ron;
    private String Tequila;
    private String Vino;
    private String Whisky; 

    public TipoLicor(String Aguardiente, String Cerveza, String Ron, String Tequila, String Vino, String Whisky) {
        this.Aguardiente = Aguardiente;
        this.Cerveza = Cerveza;
        this.Ron = Ron;
        this.Tequila = Tequila;
        this.Vino = Vino;
        this.Whisky = Whisky;
    }

    public String getAguardiente() {
        return Aguardiente;
    }

    public void setAguardiente(String Aguardiente) {
        this.Aguardiente = Aguardiente;
    }

    public String getCerveza() {
        return Cerveza;
    }

    public void setCerveza(String Cerveza) {
        this.Cerveza = Cerveza;
    }

    public String getRon() {
        return Ron;
    }

    public void setRon(String Ron) {
        this.Ron = Ron;
    }

    public String getTequila() {
        return Tequila;
    }

    public void setTequila(String Tequila) {
        this.Tequila = Tequila;
    }

    public String getVino() {
        return Vino;
    }

    public void setVino(String Vino) {
        this.Vino = Vino;
    }

    public String getWhisky() {
        return Whisky;
    }

    public void setWhisky(String Whisky) {
        this.Whisky = Whisky;
    }
    

}

        
