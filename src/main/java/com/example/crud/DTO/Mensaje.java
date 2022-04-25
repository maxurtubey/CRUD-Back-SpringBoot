
package com.example.crud.DTO;

public class Mensaje {
    private String mensaje;
    
    public Mensaje(String nota) {
        this.mensaje = nota;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
