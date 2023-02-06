package modelo;


import general.Sistema;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Administrador extends Trabajador {

    public Administrador(String nombre, String apellido, String DNI, String telefono, String user, String password, String correo) {
        super(nombre, apellido, DNI, telefono, user, password, correo);
    }
    
    public void registrarTrabajdor(Trabajador t){
        
        Trabajador [] aux = Sistema.trabajadores.getLista();
        
        Sistema.trabajadores.lista = new Trabajador [Sistema.trabajadores.lista.length+1];
        
        for(int i=0; i<aux.length; i++)
            Sistema.trabajadores.lista[i] = aux[i];
        
        Sistema.trabajadores.lista[Sistema.trabajadores.lista.length-1] = t;
        
        addMatriz(t);
        
        
    }
    
    private void addMatriz(Trabajador t){
        String [][] aux = Sistema.trabajadores.matrizTrabajadores;
        Sistema.trabajadores.matrizTrabajadores = new String[Sistema.trabajadores.matrizTrabajadores.length+1][7];
        
        for(int i=0; i<aux.length; i++){
            Sistema.trabajadores.matrizTrabajadores[i][0] = String.valueOf(i+1);
            Sistema.trabajadores.matrizTrabajadores[i][1] = aux[i][1];
            Sistema.trabajadores.matrizTrabajadores[i][2] = aux[i][2];
            Sistema.trabajadores.matrizTrabajadores[i][3] = aux[i][3];
            Sistema.trabajadores.matrizTrabajadores[i][4] = aux[i][4];
            Sistema.trabajadores.matrizTrabajadores[i][5] = aux[i][5];
            Sistema.trabajadores.matrizTrabajadores[i][6] = aux[i][6];
            
        }
        
        Sistema.trabajadores.matrizTrabajadores[Sistema.trabajadores.matrizTrabajadores.length-1][0] = String.valueOf(Sistema.trabajadores.matrizTrabajadores.length);
        Sistema.trabajadores.matrizTrabajadores[Sistema.trabajadores.matrizTrabajadores.length-1][1] = t.getNombre();
        Sistema.trabajadores.matrizTrabajadores[Sistema.trabajadores.matrizTrabajadores.length-1][2] = t.getApellido();
        Sistema.trabajadores.matrizTrabajadores[Sistema.trabajadores.matrizTrabajadores.length-1][3] = t.getDni();
        Sistema.trabajadores.matrizTrabajadores[Sistema.trabajadores.matrizTrabajadores.length-1][4] = t.getTelefono();
        Sistema.trabajadores.matrizTrabajadores[Sistema.trabajadores.matrizTrabajadores.length-1][5] = t.getUser();
        Sistema.trabajadores.matrizTrabajadores[Sistema.trabajadores.matrizTrabajadores.length-1][6] = t.getCorreo();
        
    }
    
    
}
