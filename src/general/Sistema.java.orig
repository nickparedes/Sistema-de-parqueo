package general;


import modelo.ListaTrabajadores;
import modelo.Trabajador;
import modelo.Administrador;
import formularios.*;
import java.io.Serializable;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Sistema  {
    public static ListaTrabajadores trabajadores = new ListaTrabajadores();
    
    public static Trabajador usuarioConectado = null;
    
    
    public static void iniciarSesion(String user, String password){
        
        
        for(int i=0; i<trabajadores.lista.length; i++)
            if(user.equals(trabajadores.lista[i].getUser()) && password.equals(trabajadores.lista[i].getPassword())){
                usuarioConectado = trabajadores.lista[i];
                String clase = usuarioConectado.getClass().getName();
                System.out.println(clase);
                
            }
        
        if(usuarioConectado != null){
            if(usuarioConectado.getClass().getName().equals("modelo.Administrador")){
                FrmMenuAdmin formulario = new FrmMenuAdmin();
            
            }    
            
            else if(usuarioConectado.getClass().getName().equals("modelo.Trabajador")){
             
                VentanaRegistro formulario = new VentanaRegistro();
                formulario.setVisible(true);
            }
        }
        
        else
            JOptionPane.showMessageDialog(null, "El usuario no esta registrado");

    }
    
    private void addMatriz(Trabajador t){
        
    }
    
    public static boolean validarTextoNumerico(String string, int size){
        boolean resultado = true;
        
        for(int i=0; i<string.length(); i++)
            if((string.charAt(i) < 48 || string.charAt(i) > 57) || string.length() != size)
                resultado = false;
        
        return resultado;
    }
    
    public static boolean validarTextoAlfaNumerico(String string){
        boolean resultado = true;
        
        for(int i=0; i<string.length(); i++)
            if((string.charAt(i) < 48 || string.charAt(i) > 57) && (string.charAt(i) < 65 || string.charAt(i) > 90) && (string.charAt(i) < 97 || string.charAt(i) > 122) && (string.charAt(i) != 45 && string.charAt(i) != 46 && string.charAt(i) != 95))
                resultado = false;
        
        return resultado;
    }
    
    public static boolean validarNombre(String string){
        boolean resultado = true;
        
        for(int i=0; i<string.length(); i++)
            if((string.charAt(i) < 65 || string.charAt(i) > 90) && (string.charAt(i) < 97 || string.charAt(i) > 122) && string.charAt(i) != 32)
                resultado = false;
        
        return resultado;
    }
     
    public static boolean validarCorreo(String correo){
        boolean resultado = false;
        
        int cantArrobas = 0;
        
        for(int i=0; i<correo.length(); i++)
            if(correo.charAt(i) == 64)
                cantArrobas++;
                
        if(cantArrobas == 1){
            boolean p1 = false;
            boolean p2 = false;
            String partes [] = new String [2];
        
            partes = correo.split("@");
        
            if(validarTextoAlfaNumerico(partes[0]))
                p1 = true;
        
            if(partes[1].equals("unmsm.edu.pe") || partes[1].equals("gmail.com") || partes[1].equals("hotmail.com") || partes[1].equals("yahoo.com"))
                p2 = true;
            
            if(p1 && p2)
                resultado = true;
        }

        return resultado;
    }
    
    public static boolean validarUserName(String usuario){
        boolean resultado = true;
        
        for(int i=0; i<trabajadores.lista.length; i++)
            if(usuario.equalsIgnoreCase(trabajadores.lista[i].getUser())){
                resultado = false;
                break;
            }
        
        return resultado;
    }
    
    public static boolean validarCorreoRepetido(String correo){
        boolean resultado = true;
        for(Trabajador t: trabajadores.lista)
            if(correo.equals(t.getCorreo())){
                resultado = false;
                break;
            }
   
        return resultado;
    }    
}



