package modelo;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Trabajador extends Persona implements Serializable{
    private String user;
    private String password;
    private String correo;

    public Trabajador(String nombre, String apellido, String DNI, String telefono, String user, String password, String correo){
        super(nombre, apellido, DNI, telefono);
        this.user = user;
        this.password = password;
        this.correo = correo;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getCorreo() {
        return correo;
    }
    
    @Override
    public String generarCodigo(String nom,String apell,String dni){
        String cod;
        String cod1;
        String cod2;
        
        String aux;
        
        
        cod=nom.substring(0,2);
        cod1=apell.substring(0,2);
        cod2=dni.substring(0,2);
        
        aux=cod+cod1+cod2;
       
        String id_Trab=aux;        
        return id_Trab;
    }
    
}
