/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import formularios.Interface_Boleta;
import formularios.InterfazRegistro;
import formularios.ReporteCajaDia;
import formularios.ReporteMes;
import formularios.VentanaRegistro;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class Administracion implements Serializable,Busqueda{
    private ReportePago boletas[]= new ReportePago[0];
    private int numeroBoleta=1000;
    
    
    InterfazRegistro reg = new InterfazRegistro();
   
    
    public Administracion() {
        
    }
    
    public ReportePago pasarInfo(){
        ReportePago rp3=new ReportePago();
        rp3.setTicket(reg.registroT());
        return rp3;
    }
    
    public void llenarRegistro(){
        reg.list.removeAllItems();
        reg.setVisible(true);
        reg.mostrarListaDesplegable();
        
    }
    
    public void mostrar(){
        reg.mostrar();
    }
    
    public int buscar(String cod){
        
      TRegistro alq [] = new TRegistro[reg.cantRegistro()];
        int pos=-1;
        alq = reg.getAlquiler();
        for(int i=0;i<reg.cantRegistro();i++){
            if(alq[i].dni().equals(cod)){
                pos=i;
            }           
        }
        return pos;
    }
    
    public void registrarSalida(){
       // reg = ven.getRegis();
        try
       {
          FileInputStream  fis=new FileInputStream("Boletas1.txt");
          ObjectInputStream G=new ObjectInputStream(fis);
                        
          boletas=(ReportePago[])G.readObject();
          
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Se está creando el archivo",
                      "Apertura de Archivo", JOptionPane.INFORMATION_MESSAGE);
        }
        
        String dni;
        Interface_Boleta bolt = new Interface_Boleta();
        
        dni = JOptionPane.showInputDialog("Introduce el DNI de salida:");
        
        numeroBoleta=1000;

        
        
        if(buscar(dni)!=-1){
            for(int i=0;i<boletas.length;i++){
                if( boletas[i].getDni().equals(dni)&&boletas[i].getAnio_Salida()==0){
                 int auxiliar=1;
                    for(int j=0;j<boletas.length;j++){
                        if(boletas[j].getAnio_Salida()!=0){
                            auxiliar++;
                        }
                    }
                    LocalDateTime ahora= LocalDateTime.now();
                    int dia=ahora.getDayOfMonth();
                    int mes=ahora.getMonthValue();
                    int anio=ahora.getYear();
                    int hora=ahora.getHour();
                    int min=ahora.getMinute();
                    numeroBoleta = auxiliar+numeroBoleta;
                    boletas[i].setAnio_Salida(anio);
                    boletas[i].setMes_Salida(mes);
                    boletas[i].setDia_Salida(dia);
                    boletas[i].setHora_Salida(hora);
                    boletas[i].setMin_Salida(min);
                    boletas[i].setCodigoBoleta(numeroBoleta);
                    bolt.setReporte(boletas[i]);
                    bolt.asiganarDatos();
                    bolt.setVisible(true);
                    
                   try
                    {
                        FileOutputStream fos=new FileOutputStream("Boletas1.txt");
                        ObjectOutputStream G=new ObjectOutputStream(fos);
                        
                        G.writeObject(boletas);
              
    
                        G.flush();
                        G.close();
                        
                    }catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,"El archivo no se ha guardado correctamente",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }                  
                    
                    reg.eliminar(dni);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "El DNI no se encuentra Registrado",
                    "Información",JOptionPane.INFORMATION_MESSAGE);
        }
    }


    
    public void leerRegistro(){
        reg.setVisible(true);

    }
    
    
    //exception de fecha
    public void calculo(int dia,int mes,int anio) throws FechaException{
        
       if(dia>0 && anio>0){ 
            switch(mes){

                case 1:if(dia>31){
                    throw new FechaException();
                    }break;

                case 2:
                    if(anio%4==0 && ( anio%100!=0 || anio%400==0)){
                       if(dia>29){
                            throw new FechaException();
                        }   
                    }else{
                        if(dia>28){
                            throw new FechaException();
                        }
                    }
                    break;

                case 3:
                    if(dia>31){
                        throw new FechaException();
                    }break;

                case 4:if(dia>30){
                    throw new FechaException();
                    } break;

                case 5:if(dia>31){
                    throw new FechaException();
                    }break;

                case 6:if(dia>30){
                    throw new FechaException();
                     } break;

                case 7:if(dia>31){
                    throw new FechaException();
                    }break;

                case 8:if(dia>31){
                    throw new FechaException();
                    }break;

                case 9:if(dia>30){
                    throw new FechaException();
                    } break;

                case 10:if(dia>31){
                    throw new FechaException();
                    }break;

                case 11:if(dia>30){
                    throw new FechaException();
                    } break;

                case 12:if(dia>31){
                    throw new FechaException();
                    }break;  

                default : throw new FechaException();
            }
        }
    else{
        throw new FechaException();
    }
    }
    
    public void calculoMes(int mes,int anio)throws FechaException{
        if(anio>0){
            if(mes<=0 && mes>12){
                throw new FechaException();
            }
        }else{
            throw new FechaException();
        }
    }
    
    
    
    public int cantBoletas(int dia, int mes, int anio){
        
        try
        {
            FileInputStream fis=new FileInputStream("Boletas1.txt");
            ObjectInputStream H=new ObjectInputStream(fis);
            boletas=(ReportePago[])H.readObject();
            
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Se está creando el archivo",
                      "Apertura de Archivo", JOptionPane.INFORMATION_MESSAGE);

        }
        
        
        int cant=0;
        for(int i=0;i<boletas.length;i++){
            if((boletas[i].getAnio_Salida()==anio && boletas[i].getMes_Salida() == mes) && boletas[i].getDia_Salida() == dia){
                cant++;
            }
        }
        return cant;
    }
    
    public void buscarBoleta(){
        try
       {
          FileInputStream  fis=new FileInputStream("Boletas1.txt");
          ObjectInputStream G=new ObjectInputStream(fis);
                        
          boletas=(ReportePago[])G.readObject();
          
        }catch(Exception e)
        {
                        JOptionPane.showMessageDialog(null,"Se está creando el archivo",
                      "Apertura de Archivo", JOptionPane.INFORMATION_MESSAGE);
        }
        String numeroBoleta;
        Boolean bandera=true;
        numeroBoleta = JOptionPane.showInputDialog("Intrduzca el numero de boleta a buscar");
        int aux=0;
        Interface_Boleta bolt = new Interface_Boleta();
        try{
            aux=Integer.parseInt(numeroBoleta);
        }
        catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null, "La Numeracion No existe","Error"
                     ,JOptionPane.ERROR_MESSAGE);  
             bandera=false;
        } 
       
        
        for(int i=0;i<boletas.length;i++){
            if(bandera==true && boletas[i].getCodigoBoleta()==aux){
                bolt.setReporte(boletas[i]);
                bolt.asiganarDatos();
                bolt.setVisible(true);
            }
        }
    }
}
