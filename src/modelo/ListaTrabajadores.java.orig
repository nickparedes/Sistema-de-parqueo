package modelo;

import general.Sistema;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
public class ListaTrabajadores implements Serializable{
    public Trabajador [] lista = {new Administrador("Jafet Raul", "Puyen Huapaya", "71269132", "975235149", "admin", "1", "jafet.puyen@unmsm.edu.pe") };
    public  String [][] matrizTrabajadores = new String[0][];
    public String [] cabecera = {"N°", "Nombres", "Apellidos", "DNI", "Telefono", "Usuario", "Correo"};
    
    public Trabajador[] getLista() {
        return lista;
    }

    public String[][] getMatrizTrabajadores() {
        return matrizTrabajadores;
    }

    public String[] getCabecera() {
        return cabecera;
    }
    
    public void serializar(){
        try{
            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("datosListaTrabajadores"));
            fichero.writeObject(lista);
            fichero.close();
            System.out.println("Se creo datosListaTrabajadores");
      
        }
        
        catch(Exception e){
            System.out.println("No se pudo serializar datosListaTrabajadores");
        }
        
        try{
            ObjectOutputStream fichero2 = new ObjectOutputStream(new FileOutputStream("datosMatrizTrabajadores"));
            fichero2.writeObject(matrizTrabajadores);
            fichero2.close();
            System.out.println("Se creo datosMatrizTrabajadores");
        }
        
        catch(Exception e){
            System.out.println("No se pudo serializar la datosMatrizTrabajadores");
        }
    }
    
    public void recuperarSerial(){
        try{
            ObjectInputStream fichero1 = new ObjectInputStream(new FileInputStream("datosListaTrabajadores"));
            Sistema.trabajadores.lista = (Trabajador []) fichero1.readObject();
            fichero1.close();
            System.out.println("Se recupero el serial datosListaTrabajadores");
  
        }
        catch(Exception e){
            System.out.println("No se pudo recuperar datosListaTrabajadores");
        }
        
        try{
            ObjectInputStream fichero2 = new ObjectInputStream(new FileInputStream("datosMatrizTrabajadores"));
            Sistema.trabajadores.matrizTrabajadores = (String [][]) fichero2.readObject();
            fichero2.close();
            System.out.println("Se recupero el serial datosMatrizTrabajadores");
            
        }
        catch(Exception e){
            System.out.println("No se pudo recuperar matriz de RegistroLogin");
        }
    }
    
 
    
}
