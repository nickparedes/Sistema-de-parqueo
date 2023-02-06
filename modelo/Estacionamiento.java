
package modelo;

import java.io.Serializable;


public class Estacionamiento implements Serializable{
    private String codEsp;
    private boolean disponibilidad;
    
    public Estacionamiento(){        
    }

    public Estacionamiento(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    //cosntructor
    public Estacionamiento(String codEsp, boolean disp){
        this.codEsp = codEsp;
        disponibilidad = disp;
    }

    public String getCodEsp() {
        return codEsp;
    }

    public void setCodEsp(String codEsp) {
        this.codEsp = codEsp;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
    public void modificarDisponibilidad(){
        this.disponibilidad = !this.disponibilidad;
    }
    
    
}
