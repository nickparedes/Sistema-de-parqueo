
package modelo;

import java.io.Serializable;

public class Cliente extends Persona implements Serializable{
    private String id_Cliente;
    private Vehiculo automovil;
    
    public Cliente (){
        
    }
    
    public Cliente(String nomb,String apell,String telf,String dni){
        super(nomb,apell,telf,dni); 
     }
    
     public void setId_Cliente(String id_Cliente) {
        this.id_Cliente = id_Cliente;
    }
     public String getId_Cliente() {
        return id_Cliente;
    }

    public Vehiculo getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Vehiculo automovil) {
        this.automovil = automovil;
    }
     
     public String generarCodigo(String nom,String apell,String dni){
        String cod;
        String cod1;
        String cod2;
        
        String aux;
        
        
        cod=nom.substring(0,2);
        cod1=apell.substring(0,2);
        cod2=dni.substring(0,2);
        
        aux=cod+cod1+cod2;
       
        id_Cliente=aux;        
        return id_Cliente;
    }
    
}
