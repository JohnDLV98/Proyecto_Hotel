package proyecto;


    public class Cliente extends Persona {
        private String Correo;
        private String Telefono;
    
        public Cliente(String Correo, String Telefono, String nombre, String apellido, String id, int edad) {
            super(nombre, apellido, id, edad);
            this.Correo = Correo;
            this.Telefono = Telefono;
        }
    
        public String getCorreo() {
            return Correo;
        }
    
        public void setCorreo(String Correo) {
            this.Correo = Correo;
        }
    
        public String getTelefono() {
            return Telefono;
        }
    
        public void setTelefono(String Telefono) {
            this.Telefono = Telefono;
        }
        
    
       
            
        }
    


